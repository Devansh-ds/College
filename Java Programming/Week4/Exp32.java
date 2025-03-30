package Week4;

import java.util.Scanner;

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Exp32 {
    
    // Method that throws a custom exception
    static void validate(int num) throws CustomException {
        if (num < 0) {
            throw new CustomException("Negative numbers are not allowed!");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            validate(num);
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block.");
            sc.close();
        }
    }
}
