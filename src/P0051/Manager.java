package P0051;

import java.util.Scanner;

public class Manager {
    public Scanner sc = new Scanner(System.in);

    enum BMI {
        Under_standard, Standard, Overweight, Fat, Very_fat
    }

    private double normalCalculation(double memory, char operator, double number) {
        double result = 0;
        switch (operator) {
            case '+':
                result = memory + number;
                break;
            case '-':
                result = memory - number;
                break;
            case '*':
                result = memory * number;
                break;
            case '/':
                if (number == 0) {
                    System.out.println("Can not divide by zero");
                    return memory;
                } else {
                    result = memory / number;
                }
                break;
            case '^':
                result = Math.pow(memory, number);
                break;
        }
        return result;
    }

    public int menu() {
        System.out.println("======Calculator Program======");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.println("Please choice one option");
        GetInput getInput = new GetInput();
        int choice = getInput.getInputInt(1, 3);
        return choice;
    }

    public void printNormalCalculator() {
        GetInput getInput = new GetInput();
        double memory = 0;
        double result = 0;
        double number = getInput.getDouble("Enter number: ");
        memory += number;
        while (true) {
            String stringOperator = getInput.getChar("Enter operator: ");
            char operator = stringOperator.charAt(0);
            if (operator == '=') {
                result = memory;
                System.out.println("Result: " + result);
                break;
            }
            double number2 = getInput.getDouble("Enter number: ");
            memory = normalCalculation(memory, operator, number2);
            System.out.println("Memory: " + memory);
        }
    }

    public double caculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public BMI checkBMI(double bmi) {
        if (bmi < 19) {
            return BMI.Under_standard;
        } else if (bmi >= 19 && bmi < 25) {
            return BMI.Standard;
        } else if (bmi >= 25 && bmi < 30) {
            return BMI.Overweight;
        } else if (bmi >= 30 && bmi < 40) {
            return BMI.Fat;
        } else {
            return BMI.Very_fat;
        }
    }

    public void printTypeBMI() {
        GetInput getInput = new GetInput();
        double weight = getInput.getBmi("Enter weight: ");
        double height = getInput.getBmi("Enter height: ");
        height /= 100;
        double bmi = caculateBMI(weight, height);
        System.out.printf("%4.2f\n", bmi);
        System.out.println("BMI Status: " + checkBMI(bmi));
    }
}
