package prac19and20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n - кол-во генерируемых номеров:\n");
        int n = sc.nextInt();
        Generate generate = new Generate(n);
        int w = 1;
        while (w == 1) {
            String var;
            System.out.println("Введите номер для поиска:\n");
            var = sc.next();
            generate.straightSearchPrint(var);
            generate.hashSetPrint(var);
            generate.treeSetPrint(var);
            generate.binarySearchPrint(var);
            System.out.println("Введите 1, если хотите продолжить:\n");
            w = sc.nextInt();
        }

    }
}
