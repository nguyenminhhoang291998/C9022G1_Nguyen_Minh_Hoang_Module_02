package ss16_io_text.exercise.copy_file_text.controllers;

import ss16_io_text.exercise.copy_file_text.services.CopyFileTextService;

public class CopyFileTextController {
       private final CopyFileTextService copyFileTextService = new CopyFileTextService();
        public void copyFile(String pathFile, String targetFile) {
            this.copyFileTextService.copyFile(pathFile, targetFile);
        }
}
