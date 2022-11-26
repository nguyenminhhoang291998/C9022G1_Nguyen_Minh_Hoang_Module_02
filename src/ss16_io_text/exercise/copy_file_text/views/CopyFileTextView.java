package ss16_io_text.exercise.copy_file_text.views;

import ss16_io_text.exercise.copy_file_text.controllers.CopyFileTextController;

import java.util.Scanner;

public class CopyFileTextView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CopyFileTextController copyFileTextController = new CopyFileTextController();
        String pathFile = "src/ss16_io_text/exercise/copy_file_text/models/source_file.csv";
        System.out.println("Nhập tên file mới để nhận copy: ");
        String targetFile = scanner.nextLine();
        copyFileTextController.copyFile(pathFile, targetFile);
    }
}
