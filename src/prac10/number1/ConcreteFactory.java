package prac10.number1;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        Complex complex = new Complex();
        return complex;
    }

    @Override
    public Complex createComplex(int real, int image) {
        Complex complex = new Complex(real, image);
        return complex;
    }
}
