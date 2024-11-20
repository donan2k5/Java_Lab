package P0050;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("=====Equation Program=====");
            Manager manager = new Manager();
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    System.out.println("------ Calculate Superlative Equation -------");
                    manager.calculateSuperlativeEquation();
                    break;
                case 2:
                    System.out.println("------ Calculate Quadratic Equation -------");
                    manager.calculateQuadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}