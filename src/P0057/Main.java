package P0057;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/user.dat");
        createFile(file);
        GetInput getInput = new GetInput();
        UserManagement userManagement = new UserManagement(getInput, file);
        while (true) {
            System.out.println("-----USER MANAGEMENT SYSTEM-----");
            System.out.println("1. Create new Account");
            System.out.println("2. Login system");
            System.out.println("3. Exit");
            int choice = getInput.getIntChoice("Enter your choice: ", 1, 3);
            switch (choice) {
                case 1:
                    userManagement.createNewAccount();
                    break;
                case 2:
                    userManagement.login();
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void createFile(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
