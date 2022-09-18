package prac09.number1;

public class InnException extends Exception{

    private String inn;

    public InnException(String inn) {
        super("ИНН "+ inn + " не действителен!");
        this.inn = inn;
    }
}
