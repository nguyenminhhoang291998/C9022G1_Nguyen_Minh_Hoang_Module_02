package restro.map_compa;

import java.util.Map;
import java.util.TreeMap;

public class DemoMap2 {
    public static void main(String[] args) {
        //Tạo 4 con mèo có id là số lộn xộn
        // lưu vào tree map -> duyệt để hiển thị.

        // Số lượng 2
        Cat cat1 = new Cat(1,"Cat1","Da Nang");
        // Số lượng 5
        Cat cat2 = new Cat(3,"Cat2","HCM");
        // Số lượng 4
        Cat cat3 = new Cat(2,"Cat3","Ha Noi");
        // Số lượng 6
        Cat cat4 = new Cat(4,"Cat4","Hue");

        Map<Cat,Integer> mapCat = new TreeMap<>();
        mapCat.put(cat1,2);
        mapCat.put(cat2,5);
        mapCat.put(cat3,4);
        mapCat.put(cat4,6);

        for (Map.Entry<Cat,Integer> entry:mapCat.entrySet()) {
            System.out.println("Key: " + entry.getKey().toString() +
                    ". Value: " + entry.getValue());
        }
    }

}
