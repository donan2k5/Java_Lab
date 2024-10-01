package P0054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        Manager manager = new Manager(getInput);
        while (true) {
            System.out.println("=====Contact Program=====");
            System.out.println("1. Add a Contact");
            System.out.println("2. Display all Contact");
            System.out.println("3. Delete a Contact");
            System.out.println("4. Exit");
            int choice = getInput.getInt("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    manager.addContact();
                    break;
                case 2:
                    manager.displayAllContact();
                    break;
                case 3:
                    manager.deleteContact();
                    break;
                case 4:
                    return;
            }
        }
    }
}
