package P0071.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class GetInputter {

    Scanner sc = new Scanner(System.in);
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public int getInt(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                if (num < 1 || num > 4) {
                    throw new NumberFormatException();
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.print(msg);
            }
        }
    }

    public String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public String getStringDateValue(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                String input = sc.nextLine();
                LocalDate date = LocalDate.parse(input, DATE_FORMAT);
                return date.format(DATE_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.print("Invalid date format. Please use dd-MM-yyyy: ");
            }
        }
    }

    public double getDouble(String msg) {
        System.out.print(msg);
        while (true) {
            try {
                double num = Double.parseDouble(sc.nextLine());
                if (num < 8.5 || num > 17.5) {
                    throw new NumberFormatException();
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.print(msg);
            }
        }
    }
}
