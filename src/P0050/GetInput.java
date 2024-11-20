import java.util.Scanner;

public class Validate {
    public static Scanner sc = new Scanner(System.in);

    public static int getInputInt(int min, int max) {
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

    public static double getDouble() {
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
