
import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidUserInputExceptionDemo {

    public static void main(String[] JavaLatte) {
        System.out.println("Type an integer on the console");

        try {
            System.out.println("You typed: " + readFromConsole());
        } catch (InvalidUserInputException ex) {
            System.out.println("Exception is of type: " + ex);
            System.out.println("Original caught exception is of type: " + ex.getCause());
        }
    }

    public static int readFromConsole() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        try {
            i = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Wrapping exception and throwing");
            throw new InvalidUserInputException("Invalid integer value entered", ex);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return i;
    }
}
class InvalidUserInputException extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public InvalidUserInputException() {
        super();
    }


    public InvalidUserInputException(String msg) {
        super(msg);
    }


    public InvalidUserInputException(Throwable throwable) {
        super(throwable);
    }


    public InvalidUserInputException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
