package P0052;

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
                System.out.println("Please enter a text sequence");
                System.out.print(msg);
            }
        }
    }

    public float getFloat(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                float f = Float.parseFloat(sc.nextLine());
                if (f < 0) {
                    throw new NumberFormatException();
                }
                return f;
            } catch (NumberFormatException e) {
                System.out.println("Please enter positive number");
                System.out.print(msg);
            }
        }
    }

    public int getInt(String msg, int min, int max) {
        System.out.print(msg);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number from " + min + " to " + max);
                System.out.print(msg);
            }
        }
    }
}
