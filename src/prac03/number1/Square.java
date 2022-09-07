package prac03.number1;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double side) {
        setWidth(side);
    }

    @Override
    public String toString() {
        return "This is a square:\n" + "Side: " + this.width + ", color: " + this.color + ", filled: " + this.filled;
    }
}

