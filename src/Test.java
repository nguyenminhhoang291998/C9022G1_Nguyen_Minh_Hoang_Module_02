public class Test {

    public static void main(String[] args) {

        System.out.println(facto(3));
    }

    private static int facto(int i) {
        if (i==1){
            return 1;
        }
        return i*facto(i-1);
    }
}



