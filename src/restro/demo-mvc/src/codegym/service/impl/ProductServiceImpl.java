package codegym.service.impl;

import codegym.model.Product;
import codegym.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    private final List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                return;
            }
        }
        this.products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }

    @Override
    public boolean editProduct(Product updatedProduct) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
