package prac7;

import java.util.Scanner;
import java.util.Stack;

public class onStack {

    public static void start() {
        int n = 10;
        Scanner sc = new Scanner(System.in);
        String[] firstInput = sc.nextLine().split(" ");
        String[] secondInput = sc.nextLine().split(" ");

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for (int i = 0; i < n / 2; ++i)
            first.push(Integer.parseInt(firstInput[n / 2 - i - 1]));
        for (int i = 0; i < n / 2; ++i)
            second.push(Integer.parseInt(secondInput[n / 2 - i - 1]));

        int countOperations = 0;
        while (!first.empty() && !second.empty()) {
            if (countOperations >= 106) {
                System.out.println("botva");
                break;
            }
            int firstBack = first.pop();
            int secondBack = second.pop();
            if (firstBack == n - 1 && secondBack == 0){
                second.add(0, firstBack);
                second.add(0, secondBack);
            }
            else
            if (firstBack == 0 && secondBack == n - 1){
                first.add(0, firstBack);
                first.add(0, secondBack);
            }
            else
            if (firstBack < secondBack) {
                second.add(0, firstBack);
                second.add(0, secondBack);
            }
            else {
                first.add(0, firstBack);
                first.add(0, secondBack);
            }
            ++countOperations;
        }
        if (first.empty()) {
            System.out.println("second " + countOperations);
        } else if (second.empty()) {
            System.out.println("first " + countOperations);
        }
    }
}
