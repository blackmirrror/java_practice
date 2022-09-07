package prac01;

public class Ball {
    private int diameter;
    private String color;

    public Ball() {}

    public Ball(int diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Diameter of the ball: " + diameter + "Color of the ball: " + color;
    }
}
