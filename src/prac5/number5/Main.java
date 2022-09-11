package prac5.number5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Сумма его цифр: " + sum(n));
    }

    public static int sum(int n) {
        if (n < 10)
            return n;
        return n % 10 + sum(n / 10);
    }
}