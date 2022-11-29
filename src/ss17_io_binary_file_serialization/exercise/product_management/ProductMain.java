package ss17_io_binary_file_serialization.exercise.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

    private static final String PATH_FILE = "src/ss17_io_binary_file_serialization/exercise/product_management/product.csv";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(display(true));
        Product p1 = new Product(1,"Tao","Trung Quoc",12000,"N3");
        Product p2 = new Product(2,"Oi","Han Quoc",15000,"R2");
        Product p3 = new Product(3,"Cam","Thai Lan",22000,"M4");
        addProduct(p1);
        addProduct(p2);
        addProduct(p3);
        System.out.println(display(true));
        findProduct(3);
    }

    private static List<Product> display(boolean checkFileEmpty) {
        List<Product> productList = new ArrayList<>();

        try {
            FileInputStream fileInputStream= new FileInputStream(PATH_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (EOFException e){
            if(checkFileEmpty){
                System.out.print("List product is empty ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return productList;
    }

    private static void addProduct(Product product) {
        List<Product> productList = display(false);
        try {
            for (Product pr : productList) {
                if (product.getId() == pr.getId()){
                    System.out.println("Id "+ product.getId() +" really exists.");
                    return;
                }
            }
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

    private static void findProduct(int id){
        List<Product> productList = display(false);
        for (Product product: productList) {
            if(id == product.getId()){
                System.out.println("Result after found is: \n"+product);
                return;
            }
        }
        System.out.println("Not found product.");
    }
}
