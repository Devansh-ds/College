import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);

        if (ch1 > ch2) {
            System.out.println("Alphabetical Order: " + ch2 + " " + ch1);
        } else {
            System.out.println("Alphabetical Order: " + ch1 + " " + ch2);
        }

        scanner.close();
    }
}

