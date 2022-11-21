package ss12_java_collection_framework.exercise;

import java.util.*;

public class ProductManager {
    List<Product> arrayList = new LinkedList<>();

    public void addProduct(Product product) {
        arrayList.add(product);
    }

    public void editProduct(int id) {
        boolean flag = true;
        for (Product product : arrayList) {
            if (product.getId() == id) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter name of product: ");
                String name = scanner.nextLine();
                product.setNameProduct(name);
                System.out.println("Enter name of product: ");
                long price = Long.parseLong(scanner.nextLine());
                product.setPrice(price);
                System.out.println("All product after edit: ");
                display();
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Not found product.");
        }
    }

    public void removeProduct(int id) {
        boolean flag = true;
        for (Product product : arrayList) {
            if (product.getId() == id) {
                arrayList.remove(product);
                System.out.println("All product after remove: ");
                display();
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Not found product.");
        }
    }

    public void display() {
        for (Product product : arrayList) {
            System.out.println(product.toString());
        }
    }

    public void findProduct(String name){
        boolean flag = true;
        for (Product product : arrayList) {
            if (product.getNameProduct().equals(name)) {
                System.out.println("Result find product: " + product.toString());
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Not found product.");
        }
    }

   public void sortAscending(){
       ComparatorAscending comparatorAscending = new ComparatorAscending();
       Collections.sort(arrayList, comparatorAscending);
       System.out.println("All product after ascending: ");
       display();
   }

    public void sortDescending(){
        ComparatorDescending comparatorIncrease = new ComparatorDescending();
        Collections.sort(arrayList,comparatorIncrease);
        System.out.println("All product after descending: ");
        display();
    }
}
