package P0054;

import java.util.ArrayList;

public class Manager {
    ArrayList<Contact> list = new ArrayList<>();
    private int count = 0;

    public void addContact() {
        GetInput getInput = new GetInput();
        int id = ++count;
        String name = getInput.getStringName("Enter name: ");
        String group = getInput.getString("Enter group: ");
        String address = getInput.getString("Enter address: ");
        String phone = getInput.getPhone("Enter phone: ");
        list.add(new Contact(id, name, group, address, phone));
        System.out.println("Successfully");
    }

    public void displayAllContact() {
        System.out.printf("%-3s%-15s%-10s%-10s%-10s%-10s%-15s\n", "ID", "Name", "FirstName", "LastName", "Group", "Address", "Phone");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }

    public void deleteContact() {
        GetInput getInput = new GetInput();
        int id = getInput.getIntId("Enter ID: ");
        if(id <= count) {
            list.remove(id - 1);
        }else {
            System.out.println("NOT FOUND ID");
        }
    }
}
