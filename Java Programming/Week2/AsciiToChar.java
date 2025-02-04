import java.util.Scanner;

public class AsciiToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter the number of ASCII values: ");
        int n = scanner.nextInt();
        int[] asciiValues = new int[n];

        // Taking ASCII values as input
        System.out.println("Enter " + n + " ASCII values:");
        for (int i = 0; i < n; i++) {
            asciiValues[i] = scanner.nextInt();
        }

        // Printing corresponding character values
        System.out.print("Character values: ");
        for (int value : asciiValues) {
            System.out.print((char) value + " ");
        }

        scanner.close();
    }
}
