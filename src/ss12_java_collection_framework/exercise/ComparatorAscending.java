package ss12_java_collection_framework.exercise;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.getPrice(), o2.getPrice());
    }
}
