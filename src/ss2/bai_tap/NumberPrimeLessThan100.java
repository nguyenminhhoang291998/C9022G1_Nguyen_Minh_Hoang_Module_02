package ss2.bai_tap;


public class NumberPrimeLessThan100 {
    public static void main(String[] args) {
        int N = 2;
        while (N<100){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N) ; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }if(check){
                System.out.println(N);

            }
            N++;

        }
    }
}
