package P0065.controller;

import P0065.model.StudentList;
import P0065.view.GetInputter;
import P0065.view.View;

public class StudentManagement {
    private final StudentList studentList;
    private final View view;
    private final GetInputter getInputter;

    public StudentManagement() {
        this.studentList = new StudentList();
        this.view = new View();
        this.getInputter = new GetInputter();
    }

    public void addStudent() {
        while (true) {
            String name = getInputter.getString("Name: ");
            String classes = getInputter.getString("Classes: ");
            double math = getInputter.getDouble("Maths");
            double physics = getInputter.getDouble("Physics");
            double chemistry = getInputter.getDouble("Chemistry");
            studentList.createStudent(name, classes, math, physics, chemistry);
            String string = getInputter.getStringYN("Do you want to enter more student information? (Y/N)");
            if (string.equals("N")) return;
        }
    }
    public void showStudent() {
        view.displayList(studentList.getList());
    }
    public void showInfo() {
        view.displayMap(studentList.getPercentTypeStudent(studentList.getList()));
    }
}
