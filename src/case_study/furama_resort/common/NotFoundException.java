package case_study.furama_resort.common;

public class NotFoundException extends Exception{
    public NotFoundException() {
        super("The ID you want to delete does not already exist.");
    }
}
