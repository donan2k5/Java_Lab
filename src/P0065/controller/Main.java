package P0065.controller;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("=====Management Student Program=====");
        studentManagement.addStudent();
        studentManagement.showStudent();
        studentManagement.showInfo();
    }
}



