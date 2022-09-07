package prac01;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(12);
        Dog dog3 = new Dog("Bublic", 10);
        dog1.setAge(2);
        dog1.setName("Persik");
        dog2.setName("Raf");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Ball ball1 = new Ball();
        Ball ball2 = new Ball(20, "red");
        ball1.setColor("blue");
        ball1.setDiameter(15);
        System.out.println(ball1);
        System.out.println(ball2);

        Book book1 = new Book("Hotel", "Artur Hailey");
        Book book2 = new Book();
        book2.setAuthor("Artur Hailey");
        book2.setTitle("Airport");
        System.out.println(book1);
        System.out.println(book2);
    }
}
