import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    private final static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.getInputInt(1, 3);
        return choice;
    }

    private static boolean checkOdd(double x) {
        return x % 2 == 1;
    }

    private static boolean checkEven(double x) {
        return x % 2 == 0;
    }

    private static boolean checkPerfectSquare(double x) {
        int squareRoot = (int) Math.sqrt(x);
        return squareRoot * squareRoot == x;
    }

    private static void printOddNumbers(double [] list) {
        System.out.print("Number is odd: ");
        boolean check = false;
        for (double v : list) {
            if (checkOdd(v)) {
                check = true;
                System.out.print(v + " ");
            }
        }
        if(!check) {
            System.out.print("NO");
        }
        System.out.println();
    }

    private static void printEvenNumbers(double [] list) {
        System.out.print("Number is even: ");
        boolean check = false;
        for (double v : list) {
            if (checkEven(v)) {
                check = true;
                System.out.print(v + " ");
            }
        }
        if(!check) {
            System.out.print("NO");
        }
        System.out.println();
    }

    private static void printPerfectSquareNumbers(double [] list) {
        System.out.print("Number is Perfect Square: ");
        boolean check = false;
        for (double v : list) {
            if (checkPerfectSquare(v)) {
                check = true;
                System.out.print(v + " ");
            }
        }
        if(!check) {
            System.out.print("NO");
        }
        System.out.println();
    }

    public static void calculateSuperlativeEquation() {
        System.out.print("Enter A: ");
        double a = Validate.getDouble();
        System.out.print("Enter B: ");
        double b = Validate.getDouble();
        double x = -b/a;
        System.out.println("Solution: x = " + x);
        double [] list = {a, b, x};
        printOddNumbers(list);
        printEvenNumbers(list);
        printPerfectSquareNumbers(list);
    }

    public static void calculateQuadraticEquation() {
        System.out.print("Enter A: ");
        double a = Validate.getDouble();
        System.out.print("Enter B: ");
        double b = Validate.getDouble();
        System.out.print("Enter C: ");
        double c = Validate.getDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;
        System.out.println("Solution x1 = " + x1 + " and x2 = " + x2);
        double [] list = {a, b, c, x1, x2};
        printOddNumbers(list);
        printEvenNumbers(list);
        printPerfectSquareNumbers(list);
    }
}
