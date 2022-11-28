package ss17_io_binary_file_serialization.practice.binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path,true);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readDataFromObject(String path){
        List<Student> students;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            for (Student student: students) {
                System.out.println(student);
            }
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Anh","HN"));
        students.add(new Student(2,"Quan","HN"));
        students.add(new Student(3,"Tai","HN"));
        students.add(new Student(4,"Nhan","HN"));
        writeToObject("src/ss17_io_binary_file_serialization/practice/binary_file/class.csv",students);
        readDataFromObject("src/ss17_io_binary_file_serialization/practice/binary_file/class.csv");
    }


}
