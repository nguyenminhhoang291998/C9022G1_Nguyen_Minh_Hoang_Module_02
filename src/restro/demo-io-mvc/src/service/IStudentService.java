package service;

import exceptions.ExistedStudentException;
import exceptions.NotFoundStudentException;
import model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {

    void addStudent(Student student) throws ExistedStudentException, IOException;

    List<Student> getStudents() throws IOException;

    void deleteStudent(int id) throws NotFoundStudentException, IOException;

    void editStudent(Student student) throws IOException;
}
