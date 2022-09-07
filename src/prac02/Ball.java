package prac02;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(){}

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move( double plusX, double plusY){
        x += plusX;
        y += plusY;
    }

    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
