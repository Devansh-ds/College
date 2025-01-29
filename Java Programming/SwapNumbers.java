
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = sc.nextInt();
        System.out.print("Enter second num: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
