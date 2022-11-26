package restro.io_text.controller;

import java.io.*;

public class ReadAndWriteString {
    // Ghi các dòng sau vào file CSV
    /*C0522G1
     * C0622G1
     * C0722G1
     * C0822G1
     * C0922G1*/
    public static final String PATH_NAME = "src\\ss15_io_text_file\\data\\string.csv";

    public static void main(String[] args) {
        File file = new File(PATH_NAME);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("C0522G1\n");
            fileWriter.write("C0622G1\n");
            fileWriter.write("C0722G1\n");
            fileWriter.write("C0822G1\n");
            fileWriter.write("C0922G1\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH_NAME);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
