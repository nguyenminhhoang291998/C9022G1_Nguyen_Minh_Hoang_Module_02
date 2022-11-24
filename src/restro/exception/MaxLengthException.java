package restro.exception;
//Custom exception
public class MaxLengthException extends Exception {
    @Override
    public String getMessage() {
//        return super.getMessage();
        String str = "Dài quá 50 ký tự";
        return str;
    }

//    public MaxLengthException(String message) {
//        super(message);
//    }
}
