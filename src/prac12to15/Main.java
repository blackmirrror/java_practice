package prac12to15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Enter number of exercises: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
            case 4:
                ex4();
                break;
            default:
                System.out.println("Warning: you can enter 1, 2, 3, 4, 5 or 6");
                menu();
        }
    }

    private static void ex1() {
        Person p1 = new Person("Cоловьёв");
        Person p2 = new Person("", "Бобров", "");
        Person p3 = new Person("Николай", "Романов", "Александрович");

        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());
    }

    private static void ex2() {
        Address a1 = new Address("Россия, МО   ,    Москва, проспект Вернадского, 78, 7, ИВЦ-104", false);
        Address a2 = new Address("USSR,      Leningradskaya oblast', Leningrad.    Nevskiy prospect; 234;1;23", true);
        Address a3 = new Address("UK, London, London, Trafalgar square, 2, 3, 4, other string,,,", false);
        Address a4 = new Address("Страна; регион;     город    . Улица, дом, корпус. Квартира", true);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }

    private static void ex3() {
        String[] strs = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Shirt[] shirts = new Shirt[strs.length];
        for (int i = 0; i < strs.length; i++) {
            shirts[i] = new Shirt(strs[i]);
            System.out.println(shirts[i]);
        }
    }

    private static void ex4() {
        PhoneParser pp1 = new PhoneParser("88005553551");
        PhoneParser pp2 = new PhoneParser("+79536558390");
        PhoneParser pp3 = new PhoneParser("+1234217808080");
        PhoneParser pp4 = new PhoneParser("+119013871922");

        System.out.println(pp1);
        System.out.println(pp2);
        System.out.println(pp3);
        System.out.println(pp4);
    }
}
