package P0065.model;

public class Calculation {
    public char calculateStudentType(double mark) {
        return getGrade(mark);
    }

    private char getGrade(double mark) {
        if (mark > 7.5) return 'A';
        if (mark >= 6) return 'B';
        if (mark >= 4) return 'C';
        return 'D';
    }

    public double getAverage(double math, double physics, double chemistry) {
        return (math + chemistry + physics) / 3;
    }
}
