package ss4_object.bai_tap.StopWatch;


import java.util.Arrays;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int max = 100;
        int min = 1;
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
                arr[i] = (int) (Math.random() * ((max - min) + 1)) + min;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        stopWatch.end();
        System.out.println(Arrays.toString(arr));
        System.out.println("Thuật toán này chạy hết: "+ stopWatch.getElapsedTime()+ " ms");
    }
}
