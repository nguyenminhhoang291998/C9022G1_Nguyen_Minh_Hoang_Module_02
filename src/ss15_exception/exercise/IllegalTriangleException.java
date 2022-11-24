package ss15_exception.exercise;

public class IllegalTriangleException extends Exception{

    @Override
    public String getMessage() {
        return "Ngoại lệ: Nhập không hợp lệ.";
    }
}
