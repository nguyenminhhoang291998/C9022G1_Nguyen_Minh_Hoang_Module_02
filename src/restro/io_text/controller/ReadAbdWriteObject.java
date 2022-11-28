package restro.io_text.controller;

import restro.io_text.model.Student;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ReadAbdWriteObject {
    public final static String FILE_NAME = "src/restro/io_text/data/object.csv";

    public static void main(String[] args) {
//        Student student = new Student(1, "Công Bịp", "Module 1");
//        Student student1 = new Student(2, "Công Công", "Module 2");
//        Teacher teacher = new Teacher(3, "Công Chúa", "Module 3","9476332");
//        Student student2 = new Student(3, "Công Chúa", "Module 3");
//        List<Student> studentList = new ArrayList<>();
//        List<Teacher> teacherList = new ArrayList<>();
//        studentList.add(student);
//        teacherList.add(teacher);
//        studentList.add(student1);
//        studentList.add(student2);
//        for (Student students : studentList) {
//            writeOneStudent(students);
//        }
//        writeListStudent(studentList);
//        writeListStudent(teacherList);
        readListStudent(FILE_NAME);
    }

    public static void writeOneStudent(Student student) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.writeInfor());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void writeListStudent(List<Student> studentList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: studentList) {
                bufferedWriter.write(student.writeInfor());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readListStudent(String path){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] strings = line.split(",");
                if(strings.length == 3){
                    printStringStudent(Arrays.asList(strings));
                }else if(strings.length == 4){
                    printStringTeacher(Arrays.asList(strings));
                }

            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void printStringStudent(List<String> students){
        System.out.println("Student{" +
                "id=" + students.get(0) +
                ", name='" + students.get(1) + '\'' +
                ", module='" + students.get(1) + '\'' +
                '}');
    }

    public static void printStringTeacher(List<String> teacher){
        System.out.println("Teacher{" +
                "id=" + teacher.get(0) +
                ", name='" + teacher.get(1) + '\'' +
                ", coach='" + teacher.get(2) + '\'' +
                ", numberPhone='" + teacher.get(3) + '\'' +
                '}');
    }
}

