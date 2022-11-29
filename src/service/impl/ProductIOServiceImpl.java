package service.impl;

import model.Product;
import service.IFileService;

import java.io.IOException;
import java.util.List;

public class ProductIOServiceImpl implements IFileService<Product> {
    @Override
    public List<Product> readFile(String path, boolean checkFileNotFound) throws IOException {
        return null;
    }

    @Override
    public void writeFile(String path, List<Product> students) throws IOException {

    }
}
