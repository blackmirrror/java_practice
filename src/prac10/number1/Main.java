package prac10.number1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factoryComplexNumber = new ConcreteFactory();
        System.out.println(factoryComplexNumber.createComplex(4, 1));
    }
}
