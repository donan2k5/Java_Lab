package P0055;

import java.util.Scanner;

public class GetInput {
    private final Scanner sc = new Scanner(System.in);

    public String getStringNotBlank(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = sc.nextLine();
                if (string.isBlank()) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.println("Please do not enter a blank string");
                System.out.print(msg);
            }
        }
    }

    public int getIntChoice(String msg, int min, int max) {
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

    public int getInt(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Please enter positive number.");
                System.out.print(msg);
            }
        }
    }

    public String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public String getStringCode(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = sc.nextLine();
                if (string.matches("^DOC \\d{3}$")) {
                    return string;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a code format DOC xxx");
                System.out.print(msg);
            }
        }
    }
}
