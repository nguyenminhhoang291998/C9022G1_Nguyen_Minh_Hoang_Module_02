package ss16_io_text.exercise.copy_file_text.services;

import java.io.*;

public class CopyFileTextService {
    public void copyFile(String pathFile, String targetFile) {
        File fileR;
        File fileW;
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {

            // kiểm tra file cần copy có tồn tại hay không.
            try {
                fileR = new File(pathFile);
                fileReader = new FileReader(fileR);
                bufferedReader = new BufferedReader(fileReader);
            } catch (IOException e) {
                System.err.println("File cần copy không tồn tại hoặc có nội dung lỗi.");
                return;
            }

            // kiểm tra file nhận copy có trùng file cũ không.
            fileW = new File(targetFile);
            if (fileW.exists()) {
                System.err.println("File nhận copy đã tồn tại.");
                return;
            }

            fileWriter = new FileWriter(fileW);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count += line.length();
            }

            bufferedWriter.flush();
            System.out.println("Copy thành công. Tổng số ký tự trong tệp là: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
