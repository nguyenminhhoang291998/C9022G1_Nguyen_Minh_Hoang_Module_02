package ss14_sort_algorithm.practice;

public class SelectionSort {
    static double[] list = {1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[] list){
        int size = list.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < size; j++) {
                if(list[j] < list[minIndex]){
                    minIndex = j;
                }
                double temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (double v : list) System.out.print(v + " ");
    }

}
