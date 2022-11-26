package ss16_io_text.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Integer> numbers = new ArrayList<>();
    public List<Integer> readFile(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine())!= null){
                numbers.add(Integer.valueOf(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("File không tồn tại hoặc" +
                    "nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Giá trị lớn nhất là: " + max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMaxValue(){
        int max = numbers.get(0);
        int size = numbers.size();
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    readAndWriteFile.readFile("src/ss16_io_text/text.csv");
    readAndWriteFile.writeFile("src/ss16_io_text/result.csv",findMaxValue());
    }
}
