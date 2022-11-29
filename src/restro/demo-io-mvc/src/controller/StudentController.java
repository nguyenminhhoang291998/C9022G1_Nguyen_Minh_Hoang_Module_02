package controller;

import exceptions.ExistedStudentException;
import exceptions.NotFoundStudentException;
import model.Student;
import service.IStudentService;
import service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class StudentController {

    private final IStudentService studentService = new StudentServiceImpl();

    public void addStudent(Student student) throws ExistedStudentException {
        try {
            this.studentService.addStudent(student);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> getStudents() {
        try {
            return this.studentService.getStudents();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void deleteStudent(int id) {
        try {
            this.studentService.deleteStudent(id);
        } catch (NotFoundStudentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void editStudent(Student student) {
        try {
            this.studentService.editStudent(student);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
