package ss16_io_text.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileExample {

    public static final String PATH_FILE = "src/ss16_io_text/text.csv";

    public static void main(String[] args) {
        readFileText(PATH_FILE);

    }

    public static void readFileText(String PATH_FILE) {
        try {
            File file = new File(PATH_FILE);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line ="";
            int sum = 0;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " +sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}

