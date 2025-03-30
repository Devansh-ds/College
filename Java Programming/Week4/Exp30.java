package Week4;

import java.util.Scanner;

public class Exp30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b; // May throw ArithmeticException
            System.out.println("The quotient of " + a + "/" + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
            sc.close();
        }
    }
}
