package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1,0,11,3,6,8,11,12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int number = Integer.parseInt(sc.nextLine());
        int size = arr.length;
        int index_del = -1;
        for (int i = 0; i <size ; i++) {
            if(number == arr[i]){
                index_del = i;
                System.out.println("Vị trí của phần tử muốn xóa là: " + index_del);
                for (int j = index_del; j < size-1; j++) {
                    arr[j] = arr[j+1];
                }
                System.out.println(Arrays.toString(arr));
            }
        }if(index_del == -1){
                System.out.println("Số cần xóa không có trong mảng");
        }
    }
}
