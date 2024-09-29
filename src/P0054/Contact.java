package P0054;

public class Contact {
    public int id;
    public String name;
    public String group;
    public String address;
    public String phone;

    public Contact(int id, String name, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        String word[] = name.trim().split("\\s+");
        return word[0];
    }

    public String getLastName() {
        String word[] = name.trim().split("\\s+");
        return word[1];
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.printf("%-3d%-15s%-10s%-10s%-10s%-10s%-15s\n", id, name, getFirstName(), getLastName(), group, address, phone);
    }
}
