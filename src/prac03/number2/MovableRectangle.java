package prac03.number2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean isXspeedEqualsYspeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed);
    }

    private boolean isYspeedEqualsXspeed() {
        return (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public void moveUp() {
        if (isYspeedEqualsXspeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (isYspeedEqualsXspeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (isXspeedEqualsYspeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (isXspeedEqualsYspeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "\nRectangle:\ntop left point: " + topLeft.toString() + "\nbottom right point: " + bottomRight.toString() + ";";
    }
}
