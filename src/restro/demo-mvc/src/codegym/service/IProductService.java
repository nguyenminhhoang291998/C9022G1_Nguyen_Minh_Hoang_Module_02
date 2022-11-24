package codegym.service;

import codegym.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    List<Product> getAll();

    boolean editProduct(Product updatedProduct);

    boolean delete(int id);
}
