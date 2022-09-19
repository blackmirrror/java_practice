package prac10.number2;

public class MagicChair implements Chair{

    public void doMagic() {
        System.out.println("Стул полетел!");
    }

    @Override
    public String toString() {
        return "Магический";
    }
}
