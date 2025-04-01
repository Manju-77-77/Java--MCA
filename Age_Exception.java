class ManjuException extends Exception {
    public ManjuException(String message) {
        super(message);
    }
}

public class Age_Exception {
    public static void main(String[] args) {
        try {
            checkEligibilityToVote(16);  
        } catch (ManjuException e) {
            System.out.println("My Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Eligibility check completed.");
        }
    }
    
    public static void checkEligibilityToVote(int age) throws ManjuException {
        if (age < 18) {
            throw new ManjuException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
