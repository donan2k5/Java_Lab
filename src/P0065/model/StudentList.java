package P0065.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentList {
    private final List<Student> list;
    private final Calculation calculation;

    public StudentList() {
        this.calculation = new Calculation();
        this.list = new ArrayList<>();
    }

    public void createStudent(String name, String classes, double math, double chemistry, double physics) {
        double average = calculation.getAverage(math, chemistry, physics);
        char type = calculation.calculateStudentType(average);
        list.add(new Student(name, classes, math, physics, chemistry, average, type));
    }

    public List<Student> getList() {
        return this.list;
    }

    public HashMap <Character, String> getPercentTypeStudent(List<Student> list) {
        HashMap <Character, String> map = new HashMap<>();
        int total = list.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;

        for (Student student : list) {
            if (student.getType() == 'A') typeA++;
            if (student.getType() == 'B') typeB++;
            if (student.getType() == 'C') typeC++;
            if (student.getType() == 'D') typeD++;
        }

        map.put('A', String.format("%.2f%%", typeA * 100 / total));
        map.put('B', String.format("%.2f%%", typeB * 100 / total));
        map.put('C', String.format("%.2f%%", typeC * 100 / total));
        map.put('D', String.format("%.2f%%", typeD * 100 / total));

        return map;
    }

}