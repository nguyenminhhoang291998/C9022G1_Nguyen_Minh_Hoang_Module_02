package exceptions;

public class NotFoundStudentException extends Exception {
    public NotFoundStudentException() {
        super("Not found student in database");
    }
}
