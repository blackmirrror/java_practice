package prac09.number2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(1, "Hello", 18));
        s.add(new Student(2, "Namee", 13));
        s.add(new Student(3, "Username", 10));
        s.add(new Student(4, "Someone", 28));
        s.add(new Student(5, "Who", 18));

        new LabClassUI(s);
    }
}
