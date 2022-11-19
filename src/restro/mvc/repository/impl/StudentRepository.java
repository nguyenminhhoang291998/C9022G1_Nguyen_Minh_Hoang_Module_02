package restro.mvc.repository.impl;

import restro.mvc.model.Student;
import restro.mvc.repository.IStudentRepository;

public class StudentRepository implements IStudentRepository {
    //Tạo mảng student
    public static Student[] arrStudent = new Student[3];
    // Sử dụng khối static để khởi tạo giá trị cho các phần tử trong mảng
    static {
        arrStudent[0] = new Student("Tài","lehuutai0310@gmail.com");
        arrStudent[1] = new Student("Tiến","tienbip@gmail.com");
        arrStudent[2] = new Student("Quân","quankdivaobar@gmail.com");
    }

    @Override
    public void display() {
        for (Student student : arrStudent) {
            System.out.println(student.toString());
        }
    }
}
