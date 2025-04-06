import java.io.*;

public class Exp51 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:/Users/Devan/College/input.txt");

        // Create file and write data if not exists
        if (!inputFile.exists()) {
            inputFile.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile));
            bw.write("This is the original file.\nIt will be copied to another file.");
            bw.close();
            System.out.println("Sample content written to input.txt");
        }

        File outputFile = new File("C:/Users/Devan/College/output.txt");

        // Copy content
        FileReader reader = new FileReader(inputFile);
        FileWriter writer = new FileWriter(outputFile);

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch);
        }

        reader.close();
        writer.close();

        System.out.println("Content copied from input.txt to output.txt");
    }
}
