package codegym.view;

import codegym.controller.ProductController;
import codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private final Scanner sc = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void displayProductMenu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Get all");
            System.out.println("2. Add new product");

            System.out.println("Nhap lua chon cua ban: ");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    List<Product> products = this.productController.getAll();
                    // Hien thi
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    System.out.println("Nhap ID");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap name");
                    String name = sc.nextLine();

                    Product product = new Product(id, name);

                    this.productController.add(product);
                    break;
                default:
                    System.out.println("...");
            }
        }
    }
}
