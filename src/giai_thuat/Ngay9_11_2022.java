package giai_thuat;

public class Ngay9_11_2022 {
    public static void main(String[] args) {
        int[] arr = {8,7,2,5,3,1};
        int x = 10;
        int size = arr.length;
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j < size; j++) {
                    if(arr[i]+ arr[j]==x){
                        System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
}
