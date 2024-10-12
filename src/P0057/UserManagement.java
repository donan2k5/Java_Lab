package P0057;

import java.io.File;

public class UserManagement {
    File file;
    GetInput getInput;
    UserDAO userDAO = new UserDAO();

    public UserManagement(GetInput getInput, File file) {
        this.getInput = getInput;
        this.file = file;
    }

    public void createNewAccount() {
        String userName = getInput.getStringName("Enter Name: ");
        String password = getInput.getStringPassword("Enter Password: ");
        userDAO.addAccount(userName, password, file);
        System.out.println("Successful");
    }

    public void login() {
        String userName = getInput.getString("Enter Name: ");
        String password = getInput.getString("Enter Password: ");
        if (userDAO.checkLogin(userName, password, file)) {
            System.out.println("Login Successfully.");
        } else {
            System.out.println("Username or password is wrong.");
        }
    }
}
