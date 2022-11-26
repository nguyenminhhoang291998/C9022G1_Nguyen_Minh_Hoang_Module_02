package ss16_io_text.exercise.read_file_csv.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCountriesService {
    public void readListCountries(String path) {
        try {
            File file = new File(path);
            FileReader fileReader;
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                printString(display(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public List<String> display(String line) {
        List<String> result = new ArrayList<>();
        String[] dataSplit = line.split(",");
        Collections.addAll(result, dataSplit);
        return result;
    }

    public void printString(List<String> country) {
        System.out.println("Country{" +
                "id=" + country.get(0) +
                ", code='" + country.get(1) + '\'' +
                ", nameCountry='" + country.get(2) + '\'' +
                '}');
    }

}
