package prac03.number1;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle() {
        super();
        this.width = 10;
        this.height = 10;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "This is a rectangle:\n" + "Length: " + this.height + ", width: "+ this.width + ", color: "+ this.color + ", filled: " + this.filled;
    }

}
