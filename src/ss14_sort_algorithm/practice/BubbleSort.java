package ss14_sort_algorithm.practice;

public class BubbleSort {
    static int[] list = {2,4,8,7,9,-4,2};

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j : list) System.out.print(j + " ");
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
