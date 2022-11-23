package ss14_sort_algorithm.practice;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + " value " + (i+1));
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        int size = list.length;
        for (int i = 0; i < size-1 && needNextPass;  i++) {
            needNextPass = false;
            for (int j = size-1; j >i ; j--) {
                if(list[j] < list[j-1]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    needNextPass = true;
                }
            }
            System.out.print("List after the " + (i+1) +"' sort: ");
            for (int k : list) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
