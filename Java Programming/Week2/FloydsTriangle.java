import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int num = 1;

        // Using for loop
        System.out.println("Floyd's Triangle using for loop:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        // Using while loop
        System.out.println("\nFloyd's Triangle using while loop:");
        num = 1;
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(num++ + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        scanner.close();
    }
}
