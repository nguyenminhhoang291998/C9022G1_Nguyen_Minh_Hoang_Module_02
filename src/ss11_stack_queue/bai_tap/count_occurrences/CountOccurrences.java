package ss11_stack_queue.bai_tap.count_occurrences;

import java.util.Scanner;
import java.util.TreeMap;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String string = scanner.nextLine().toUpperCase();
        String[] array = string.split("\\s");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String s : array) {
            if (!s.equals("")) {
                Integer value = treeMap.get(s);
                if (value == null) {
                    treeMap.put(s, 1);
                } else {
                    value++;
                    treeMap.put(s, value);
                }
            }
        }

        System.out.println(treeMap);
    }
}
