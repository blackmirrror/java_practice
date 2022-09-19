package prac10.number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Client client = new Client();
        AbstractChairFactory chairFactory = new ChairFactory();
        System.out.print("Выберите, какой стул Вам нужен?\n" +
                "1 - Викторианский стул\n" +
                "2 - Магический стул\n" +
                "3 - Многофункциональный стул\n" +
                "Ваш вариант: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                VictorianChair victorianChair = chairFactory.createVictorianChair();
                client.setChair(victorianChair);
                System.out.println(victorianChair.getAge() + " лет");
                break;
            case 2:
                MagicChair magicChair = chairFactory.createMagicChair();
                client.setChair(magicChair);
                magicChair.doMagic();
                break;
            case 3:
                FunctionalChair functionalChair = chairFactory.createFunctionalChair();
                client.setChair(functionalChair);
                functionalChair.sum(28, 12);
                break;
        }
        client.sit();
    }
}
