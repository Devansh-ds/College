import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a color code (A-Z): ");
        char color = scanner.next().charAt(0);

        switch (Character.toUpperCase(color)) {
            case 'R': System.out.println("Red"); break;
            case 'G': System.out.println("Green"); break;
            case 'B': System.out.println("Blue"); break;
            case 'Y': System.out.println("Yellow"); break;
            default: System.out.println("Invalid color code");
        }

        scanner.close();
    }
}
