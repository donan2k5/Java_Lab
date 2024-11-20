package P0065.view;

import java.util.Scanner;

public class GetInputter {
    private final Scanner sc;

    public GetInputter() {
        this.sc = new Scanner(System.in);
    }

    public double getDouble(String msg) {
        while (true) {
            System.out.print(msg + ": ");
            try {
                double num = Double.parseDouble(sc.nextLine());
                if (num < 0) {
                    System.out.println(msg + "is greater than equal zero");
                    continue;
                }
                if (num > 10) {
                    System.out.println(msg + "is less than equal ten");
                    continue;
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println(msg + " is digit");
            }
        }
    }

    public String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public String getStringYN(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                String string = sc.nextLine();
                if (!string.equals("Y") && !string.equals("N")) {
                    throw new NumberFormatException();
                }
                return string;
            } catch (NumberFormatException e) {
                System.out.print(msg);
            }
        }


    }
}
