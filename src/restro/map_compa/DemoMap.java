package restro.map_compa;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Quân");
        map.put(2, "Thảo nợ lớp 50k");
        map.put(3, "Quỳnh");
        map.put(null, "Rất vui");
        map.put(null, "Rất Buồn");
        /*Cách 1*/
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
        map.replace(null,"Rất Vui");
        /*Cách 2*/
        Set<Integer> set = map.keySet();
        for (Integer entry: set){
            System.out.println("Key: " + entry + ". Value: " + map.get(entry));
        }
        List<Integer> list = new ArrayList<>();
        list.add(456);
        list.add(3453);
        list.add(877);
        list.add(3011);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(map.get(2));
        map.remove(2);
    }
}
