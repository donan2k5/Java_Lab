package P0051;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.printNormalCalculator();
                    break;
                case 2:
                    manager.printTypeBMI();
                    break;
                case 3:
                    return;
            }
        }
    }
}
