import java.io.*;
import java.util.*;

public class Exp49 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Devan/College/data.txt");

        // Create file and write sample data if not exists
        if (!file.exists()) {
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("banana\napple\ndog\nelephant\ncat");
            writer.close();
            System.out.println("Sample data written to data.txt");
        }

        // Read lines
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        // Sort lines
        Collections.sort(lines);

        // Write to a new file
        File sortedFile = new File("C:/Users/Devan/College/sorted_data.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(sortedFile));
        for (String l : lines) {
            writer.write(l);
            writer.newLine();
        }
        writer.close();

        System.out.println("Sorted content written to sorted_data.txt");
    }
}
