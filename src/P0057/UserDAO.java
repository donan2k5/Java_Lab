package P0057;

import java.io.*;
import java.util.Scanner;

public class UserDAO {
    public void addAccount(String userName, String password, File file) {
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter writer = new PrintWriter(fileWriter);

        ) {
            writer.println(userName + ";" + password + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean checkLogin(String userName, String password, File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] string = scanner.nextLine().split(";");
                if (string[0].equals(userName) && string[1].equals(password)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean checkName(String userName, File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String[] string = scanner.nextLine().split(";");
                if (string[0].equals(userName)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
