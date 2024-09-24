public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("=====Equation Program=====");
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    System.out.println("------ Calculate Superlative Equation -------");
                    Manager.calculateSuperlativeEquation();
                    break;
                case 2:
                    System.out.println("------ Calculate Quadratic Equation -------");
                    Manager.calculateQuadraticEquation();
                    break;
                case 3:
                    return;
            }
        }
    }
}