package prac09.number2;

public class EmptyStringException extends IllegalArgumentException{

    public EmptyStringException() {
        super("Передана пустая строка!");
    }
}
