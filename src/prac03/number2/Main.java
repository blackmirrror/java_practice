package prac03.number2;

public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(0, 0, 5, 10);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        movablePoint.moveLeft();
        movablePoint.moveRight();
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(5, 7, 20, 20, 15);
        System.out.println(movableCircle);
        movableCircle.moveUp();
        movableCircle.moveDown();
        movableCircle.moveUp();
        movableCircle.moveDown();
        movableCircle.moveRight();
        System.out.println(movableCircle);

        MovableRectangle movableRectangle = new MovableRectangle(8, 10, 1, 6, 32, 20);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        movableRectangle.moveUp();
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
