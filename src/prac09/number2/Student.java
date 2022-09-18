package prac09.number2;

public class Student {
    private int id;
    private String name;
    private int gpa;

    public Student(int id, String name, int gpa) {
        this.id = id;
        setName(name);
        this.gpa = gpa;
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
        if(name.equals(""))
            throw new EmptyStringException();
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return name + ", id: " + id + ", gpa: " + gpa + ";";
    }
}
