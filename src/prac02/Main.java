package prac02;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Den Brown", "dbrown22@gmail.com", 'm');
        System.out.println(author);

        Ball ball1 = new Ball();
        Ball ball2 = new Ball(12, 30);
        ball2.move(32, 4);
        System.out.println(ball2);
        ball1.setXY(1, 20);
        System.out.println(ball1);
    }
}
