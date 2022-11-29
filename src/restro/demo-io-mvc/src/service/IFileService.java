package service;

import java.io.IOException;
import java.util.List;

public interface IFileService<O> {

    List<O> readFile(String path, boolean checkFileNotFound) throws IOException;

    void writeFile(String path, List<O> students) throws IOException;
}
