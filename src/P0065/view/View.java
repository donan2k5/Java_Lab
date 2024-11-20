package P0065.view;

import P0065.model.Student;

import java.util.HashMap;
import java.util.List;

public class View {
    public void display(String msg) {
        System.out.println(msg);
    }

    public void displayList(List<Student> list) {
        int i = 0;
        for (Student student : list) {
            System.out.println("-----Student" + ++i + " Info-----");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getStudentClass());
            System.out.printf("AVG: %2.1f\n", student.getAverage());
            System.out.println("Type: " + student.getType());
        }
    }

    public void displayMap(HashMap<Character, String> map) {
        System.out.println("-----Classification Info-----");
        for (Character c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
