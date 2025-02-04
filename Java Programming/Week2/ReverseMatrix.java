public class ReverseMatrix {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer values as command-line arguments.");
            return;
        }

        int[][] matrix = new int[2][2];
        int index = 0;

        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Integer.parseInt(args[index++]);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nReversed Matrix:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
