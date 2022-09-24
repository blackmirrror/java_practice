package prac17and18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Enter number of exercises: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String right;
        switch (num) {
            case 1:
                right = "abcdefghijklmnopqrstuv18340";
                ex12(right);
                break;
            case 2:
                right = "([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})|([0-9A-Fa-f]{4}\\\\.[0-9A-Fa-f]{4}\\\\.[0-9A-Fa-f]{4})";
                ex12(right);
                break;
            case 3:
                ex3();
                break;
            default:
                System.out.println("Warning: you can enter 1, 2 or 3");
                menu();
        }
    }

    private static void ex12(String right) {
        String in;
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        in = sc.nextLine();
        Pattern pattern = Pattern.compile(right);
        Matcher matcher = pattern.matcher(in);
        if(matcher.matches())
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static void ex3() {
        String in;
        String right = "([1-9]\\d+[.]?\\d{0,2})([ ])([U][S][D]|[R][U][R]|[E][U])";
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        in = sc.nextLine();
        Pattern pattern = Pattern.compile(right);
        Matcher matcher = pattern.matcher(in);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void ex1() {
    }
}
