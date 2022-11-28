package ss17_io_binary_file_serialization.exercise.product_management;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

    private static final String PATH_FILE = "src/ss17_io_binary_file_serialization/exercise/product_management/product.csv";
    private static final List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        addProduct(new Product(1, "Tao", "Trung Quoc", 23000, "N3"));
        addProduct(new Product(2, "Cam", "Han Quoc", 30000, "M2"));
        System.out.println("All product:\n"+display());
        findProduct();
    }
    private static List<Product> display() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream= new FileInputStream(PATH_FILE);;
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);;
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return productList;
    }

    private static void addProduct(Product product) {
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
