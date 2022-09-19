package prac10.number2;

public interface AbstractChairFactory {
    FunctionalChair createFunctionalChair();
    MagicChair createMagicChair();
    VictorianChair createVictorianChair();
}
