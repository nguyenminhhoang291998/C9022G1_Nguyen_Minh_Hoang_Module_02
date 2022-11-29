package service.impl;

import model.Student;
import service.IStudentIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IStudentIOService {

    @Override
    public List<Student> readFile(String path, boolean checkFileNotFound) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            if (checkFileNotFound) {
                throw new FileNotFoundException("Not found student file");
            }
            file.createNewFile();
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        List<Student> students = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            // 1,Son,26

            String[] els = line.split(",");
            Student student = new Student(Integer.parseInt(els[0]), els[1], Integer.parseInt(els[2]));
            students.add(student);
        }

        bufferedReader.close();
        fileReader.close();

        return students;
    }

    @Override
    public void writeFile(String path, List<Student> students) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student st : students) {
            bufferedWriter.write(st.formatCSVForStudent());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }
 }
