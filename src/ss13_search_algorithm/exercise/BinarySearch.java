package ss13_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " +(i+1)  );
            int value = Integer.parseInt(scanner.nextLine());
            array[i]= value;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử cần tìm: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(length);
        System.out.println(binarySearch(array,0, length-1,value));
    }

    static String binarySearch(int[] array,int left,int right, int value){
        while (right >= left){
            int mid = (left + right)/2;
            if(array[mid]== value){
                return "Phần tử cần tìm có index " + mid;
            }else if(array[mid]> value){
                right = mid - 1;
            }else {
                left = mid +1;
            }
        }
        return "Phần tử cần tìm không có trong mảng.";
    }
}
