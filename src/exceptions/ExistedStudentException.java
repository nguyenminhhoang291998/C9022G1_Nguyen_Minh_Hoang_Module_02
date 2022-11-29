package exceptions;

public class ExistedStudentException extends Exception {
    public ExistedStudentException() {
        super("The student is available");
    }
}
