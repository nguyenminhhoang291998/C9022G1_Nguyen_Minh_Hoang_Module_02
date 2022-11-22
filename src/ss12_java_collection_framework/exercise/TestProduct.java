package ss12_java_collection_framework.exercise;

public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Cam",25000);
        Product product2 = new Product(5,"Quyt",20000);
        Product product3 = new Product(8,"Oi",15000);
        Product product4 = new Product(7,"Xoai",17000);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);
        productManager.addProduct(product3);
        productManager.addProduct(product2);
        productManager.addProduct(product4);
        productManager.addProduct(product3);

        productManager.display();
        productManager.removeProduct(8);
        productManager.findProduct("Oi");
        productManager.sortAscending();
        productManager.sortDescending();
        productManager.editProduct(5);

    }

}
