package service;


import model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
    List<Student> readFile(String path, boolean checkFileNotFound) throws IOException;

    void writeFile(String path, List<Student> students) throws IOException;
}
