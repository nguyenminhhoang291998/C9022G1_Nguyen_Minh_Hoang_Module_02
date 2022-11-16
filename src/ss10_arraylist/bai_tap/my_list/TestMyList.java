package ss10_arraylist.bai_tap.my_list;

import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Hoang");
        Student s2 = new Student(2,"Nhan");
        Student s3 = new Student(3,"Tai");
        Student s4 = new Student(4,"Quan");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(s1);
        studentMyList.add(s2);
        studentMyList.add(2,s4);
        studentMyList.remove(2);

        for (int i = 0; i < studentMyList.elements.length; i++) {
            Student student = (Student) studentMyList.elements[i];
            if(student != null){
                System.out.println(student.getId());
                System.out.println(student.getName());

            }
        }
    }
}
