package P0057;

import java.io.*;
import java.util.Scanner;

public class GetInput {
    UserDAO userDAO = new UserDAO();
    Scanner scanner = new Scanner(System.in);

    public String getStringName(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = scanner.nextLine();
                if (string.contains(" ") || string.length() < 5) {
                    throw new NumberFormatException();
                }
                if (checkNameExist(string)) {
                    throw new Exception();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("Please enter user name with no space and must be at least 5 character ");
                System.out.print(msg);
            } catch (Exception e) {
                System.out.println("User name exist");
                System.out.print(msg);
            }
        }
    }

    public String getStringPassword(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = scanner.nextLine();
                if (string.contains(" ") || string.length() < 6) {
                    throw new Exception();
                }
                return string;
            } catch (Exception e) {
                System.out.println("Please enter password with no space and must be at least 6 character ");
                System.out.print(msg);
            }
        }
    }

    public String getString(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.print(msg);
            }
        }
    }

    private boolean checkNameExist(String userName) {
        File file = new File("src/user.dat");
        return userDAO.checkName(userName, file);
    }

    public int getIntChoice(String msg, int min, int max) {
        System.out.print(msg);
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number < min || number > max) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number from " + min + " to " + max);
                System.out.print(msg);
            }
        }
    }

}
