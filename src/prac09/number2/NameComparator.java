package prac09.number2;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().charAt(0) - o2.getName().charAt(0);
    }
}
