package prac05.number6;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static boolean fun(int n, int del) {
        if (del > sqrt(n))
            return true;
        else if (n % del == 0)
            return false;
        return fun(n, del + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки на простоту: ");
        int n = sc.nextInt();
        System.out.println(fun(n, 2) ? "Простое" : "Составное");
    }
}
