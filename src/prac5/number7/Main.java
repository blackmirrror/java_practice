package prac5.number7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    static List<Integer> arr = new ArrayList<Integer>();

    public static void fun(int n, int del) {
        if (del > sqrt(n)) {
            arr.add(n);
        }
        else if (n % del == 0) {
            arr.add(del);
            fun(n/del, 2);
        }
        else {
            fun(n, del+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Все его простые множители: ");
        arr.add(1);
        fun(n, 2);
        System.out.println(arr);
    }
}
