package ss13_search_algorithm.practice;

public class BinarySearch {

    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while (high>=low){
            int mid = (low + high)/2;
            if(list[mid]==key){
                return mid;
            }else if(list[mid]>key){
                high = mid - 1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,5,88,666,15,1};
        System.out.println(binarySearch(list,88));
    }
}
