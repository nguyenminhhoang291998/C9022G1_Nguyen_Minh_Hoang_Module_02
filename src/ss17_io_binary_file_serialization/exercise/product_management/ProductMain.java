package ss17_io_binary_file_serialization.exercise.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

    private static final String PATH_FILE = "src/ss17_io_binary_file_serialization/exercise/product_management/product.csv";
    private static int count = 0;

    public static void main(String[] args) {
        Product sp1 = new Product(1, "Tao", "Trung Quoc", 23000, "N3");
        Product sp2 = new Product(2, "Cam", "Han Quoc", 30000, "M2");
        Product sp3 = new Product(4, "Gao", "Thai Lan", 15000, "L1");
        addProduct(sp1);
        addProduct(sp2);
        System.out.println(display());
        findProduct();
    }

    private static List<Product> display() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream= new FileInputStream(PATH_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (EOFException e){
            if(count == 0){
                count++;
            }else {
                System.err.println("List product is empty.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return productList;
    }

    private static void addProduct(Product product) {
        List<Product> productList = display();
        for (Product pr : productList) {
            if(product.getId() == pr.getId()){
                System.out.println("Id really exists.");
                return;
            }
        }
        try {
            productList.add(product);
            FileOutputStream fileOutputStream = new FileOutputStream(PATH_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println("Successful add.");
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

    private static void findProduct(){
        List<Product> productList = display();
        System.out.println("Enter id: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product: productList) {
            if(id == product.getId()){
                System.out.println("Result: \n"+product);
                return;
            }
        }
        System.out.println("Not found product.");
    }

}
