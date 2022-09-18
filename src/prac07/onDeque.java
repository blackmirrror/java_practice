package prac07;

import java.util.*;

public class onDeque {

    public static void start() {
        int n = 10;
        Scanner sc = new Scanner(System.in);
        Deque<Integer> first = new LinkedList<>();
        Deque<Integer> second = new LinkedList<>();
        String[] firstInput = sc.nextLine().split(" ");
        String[] secondInput = sc.nextLine().split(" ");

        for (int i = 0; i < firstInput.length; ++i) {
            first.add(Integer.parseInt(firstInput[i]));
        }
        for (int i = 0; i < secondInput.length; ++i) {
            second.add(Integer.parseInt(secondInput[i]));
        }

        int countOperations = 0;
        while (!first.isEmpty() && !second.isEmpty()) {
            if (countOperations >= 106) {
                System.out.println("botva");
                break;
            }

            int firstBack = first.remove();
            int secondBack = second.remove();
            if (firstBack == n - 1 && secondBack == 0){
                second.add(firstBack);
                second.add(secondBack);
            }
            else
            if (firstBack == 0 && secondBack == n - 1){
                first.add(firstBack);
                first.add(secondBack);
            }
            else
            if (firstBack < secondBack) {
                second.add(firstBack);
                second.add(secondBack);
            }
            else {
                first.add(firstBack);
                first.add(secondBack);
            }
            ++countOperations;
        }
        if (first.isEmpty()) {
            System.out.println("second " + countOperations);
        } else if (second.isEmpty()) {
            System.out.println("first " + countOperations);
        }
    }
}
