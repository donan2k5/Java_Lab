package P0050;

import java.util.Scanner;

public class GetInput {
    public static Scanner sc = new Scanner(System.in);

    public int getInputInt(int min, int max) {
        while (true) {
            try{
                int result = Integer.parseInt(sc.nextLine());
                if(result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please enter input number from " + min +" to " + max);
                System.out.println("Enter again: ");
            }
        }
    }

    public double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter number.");
                System.out.print("Enter again: ");
            }
        }
    }

}
