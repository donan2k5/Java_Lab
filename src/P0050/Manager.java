package P0050;

import java.util.Scanner;

public class Manager {
    private final static Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        GetInput getInput = new GetInput();
        int choice = getInput.getInputInt(1, 3);
        return choice;
    }

    private boolean checkOdd(double x) {
        return x % 2 == 1;
    }

    private boolean checkEven(double x) {
        return x % 2 == 0;
    }

    private boolean checkPerfectSquare(double x) {
        int squareRoot = (int) Math.sqrt(x);
        return squareRoot * squareRoot == x;
    }

    private void printOddNumbers(double [] list) {
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

    private void printEvenNumbers(double [] list) {
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

    private void printPerfectSquareNumbers(double [] list) {
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

    public void calculateSuperlativeEquation() {
        GetInput getInput = new GetInput();
        System.out.print("Enter A: ");
        double a = getInput.getDouble();
        System.out.print("Enter B: ");
        double b = getInput.getDouble();
        double x = -b/a;
        System.out.println("Solution: x = " + x);
        double [] list = {a, b, x};
        printOddNumbers(list);
        printEvenNumbers(list);
        printPerfectSquareNumbers(list);
    }

    public void calculateQuadraticEquation() {
        GetInput getInput = new GetInput();
        System.out.print("Enter A: ");
        double a = getInput.getDouble();
        System.out.print("Enter B: ");
        double b = getInput.getDouble();
        System.out.print("Enter C: ");
        double c = getInput.getDouble();
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
