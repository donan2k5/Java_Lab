package P0051;

import java.util.Scanner;

public class GetInput {
    public Scanner sc = new Scanner(System.in);

    public int getInputInt(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter input number from " + min + " to " + max);
                System.out.println("Enter again: ");
            }
        }
    }

    public double getDouble(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter number.");
                System.out.print(msg);
            }
        }
    }

    public String getChar(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String s = sc.nextLine();
                if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("=") || s.equals("^")) {
                    return s;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter +, -, *, /, ^, =");
                System.out.print(msg);
            }
        }
    }

    public double getBmi(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("BMI is digit.");
                System.out.print(msg);
            }
        }
    }
}
