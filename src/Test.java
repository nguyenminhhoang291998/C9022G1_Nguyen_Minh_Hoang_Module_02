import java.util.*;

public class Test {
    public static void main(String[] args) {
        String string = "nguyen   minh      hoang";
        string = string.replaceAll("\\s","");
        System.out.println(Arrays.toString(string.split("")));
        LinkedList<String> queue = new LinkedList<>();
        queue.add("hoang");
        queue.add("nguyen");
        queue.add("minh");

        System.out.println(queue.poll());

    }
}



