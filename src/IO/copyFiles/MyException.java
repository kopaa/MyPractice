package IO.copyFiles;

/**
 * User: Andrew
 * Date: 23.11.13
 */
public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
