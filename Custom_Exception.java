class ManjuException extends Exception {
    public ManjuException(String message) {
        super(message);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        try {
            checkNumber(6);  
        } catch (ManjuException e) {
            System.out.println("My Custom Error: " + e.getMessage());
        } finally {
            System.out.println("My custom Error is Created");
        }
    }
    
    public static void checkNumber(int number) throws ManjuException {
        if (number > 5) {
            throw new ManjuException("Number is above 5");
        }
    }
}
