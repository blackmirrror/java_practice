package prac6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void insertionSort (Student[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].getId() < arr[i - 1].getId()) {
                    Student tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                    flag = true;
                }
            }
        }
    }

    public static void merge(Student[] a1, Student[] a2, Student[] a3) {
        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {
            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getId() < a2[j].getId()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        Student[] arr1 = new Student[5];
        arr1[0] = new Student (3, "Kate",12);
        arr1[1] = new Student (1, "Peter",11);
        arr1[2] = new Student (2, "Ann", 10);
        arr1[3] = new Student (5, "Harry", 15);
        arr1[4] = new Student (4, "John",14);

        Student[] arr2 = new Student[5];
        arr2[0] = new Student(6,"Michale",13);
        arr2[1] = new Student(7,"Daniil",16);
        arr2[2] = new Student(10,"Denny",19);
        arr2[3] = new Student(9,"Abby",18);
        arr2[4] = new Student(8,"Frank",17);

        System.out.println("Отсортированный по id массив (вставками):");
        insertionSort(arr1);
        for (int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);

        System.out.println("\nОтсортированный по gpa массив (быстрая сортировка):");
        Comparator cmpr = new SortingStudentsByGPA();
        Arrays.sort(arr2 ,cmpr);
        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);

        System.out.println("\nОтсортированный по id массив из 2х имеющихся (слиянием):");
        Student[] arr = new Student[arr1.length + arr2.length];
        insertionSort(arr2);
        insertionSort(arr1);
        merge(arr1, arr2, arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
