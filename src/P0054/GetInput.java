package P0054;

import java.util.Scanner;

public class GetInput {
    public Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = sc.nextLine();
                for (int i = 0; i < string.length(); i++) {
                    if (Character.isDigit(string.charAt(i))) {
                        throw new NumberFormatException();
                    }
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a text of sequence");
                System.out.print(msg);
            }
        }
    }

    public int getIntId(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("ID is digit");
                System.out.print(msg);
            }
        }
    }

    public String checkString(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = sc.nextLine();
                return string;
            } catch (NumberFormatException e) {
                System.out.print(msg);
            }
        }
    }

    public String getPhone(String msg) {
        String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
                + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";
        System.out.print(msg);
        while (true) {
            try {
                String result = sc.nextLine();
                if (!result.matches(VALID_PHONE)) {
                    throw new NumberFormatException();
                }
                return result;
            }catch (NumberFormatException e) {
                System.out.println("Please input Phone flow\n"
                        + "• 1234567890\n"
                        + "• 123-456-7890 \n"
                        + "• 123-456-7890 x1234\n"
                        + "• 123-456-7890 ext1234\n"
                        + "• (123)-456-7890\n"
                        + "• 123.456.7890\n"
                        + "• 123 456 7890");
                System.out.print(msg);
            }
        }
    }
    public int getInt(String msg, int min, int max) {
        System.out.println(msg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
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

    public String getStringName(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = sc.nextLine();
                for (int i = 0; i < string.length(); i++) {
                    if (Character.isDigit(string.charAt(i))) {
                        throw new NumberFormatException();
                    }
                }
                String []word = string.trim().split("\\s+");
                if(word.length != 2) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a correct name: ");
                System.out.print(msg);
            }
        }
    }
}
