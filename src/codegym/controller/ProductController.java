package codegym.controller;

import codegym.model.Product;
import codegym.service.IProductService;
import codegym.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {

    private final IProductService productService = new ProductServiceImpl();

    public void add(Product product) {
        this.productService.add(product);
    }

    public List<Product> getAll() {
        return this.productService.getAll();
    }

    public boolean editProduct(Product updatedProduct) {
        return this.productService.editProduct(updatedProduct);
    }

    public boolean delete(int id) {
        return this.productService.delete(id);
    }
}
