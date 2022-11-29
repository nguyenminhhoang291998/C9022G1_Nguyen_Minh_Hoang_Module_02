package service.impl;

import exceptions.ExistedStudentException;
import exceptions.NotFoundStudentException;
import model.Student;
import service.IStudentIOService;
import service.IStudentService;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private static final String STUDENT_PATH_NAME =
            "/Users/sonpham/projects/spm/CodeGym/Classes/C0922G1/Demo4/src/data/students.csv";

    private final IStudentIOService studentIOService = new StudentIOServiceImpl();

    @Override
    public void addStudent(Student student) throws ExistedStudentException, IOException {
        List<Student> students = this.studentIOService.readFile(STUDENT_PATH_NAME, false);
        for (Student st : students) {
            if (st.getId() == student.getId()) {
                throw new ExistedStudentException();
            }
        }
        students.add(student);
        this.studentIOService.writeFile(STUDENT_PATH_NAME, students);
    }

    @Override
    public List<Student> getStudents() throws IOException {
        return this.studentIOService.readFile(STUDENT_PATH_NAME, true);
    }

    @Override
    public void deleteStudent(int id) throws NotFoundStudentException, IOException {
        Student deletedStudent = null;
        List<Student> students = this.studentIOService.readFile(STUDENT_PATH_NAME, false);

        for (Student st : students) {
            if (st.getId() == id) {
                deletedStudent = st;
                break;
            }
        }

        if (deletedStudent == null) {
            throw new NotFoundStudentException();
        }

        students.remove(deletedStudent);
        this.studentIOService.writeFile(STUDENT_PATH_NAME, students);
    }

    @Override
    public void editStudent(Student student) throws IOException {
        List<Student> students = this.studentIOService.readFile(STUDENT_PATH_NAME, false);

        for (Student st : students) {
            if (st.getId() == student.getId()) {
                st.setName(student.getName());
                st.setAge(student.getAge());
                break;
            }
        }

        this.studentIOService.writeFile(STUDENT_PATH_NAME, students);
    }
}
