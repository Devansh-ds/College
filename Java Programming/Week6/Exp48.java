import java.io.*;

public class Exp48 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Devan\\College\\Sample.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            sb.append(line.toUpperCase()).append(System.lineSeparator());
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(sb.toString());
        writer.close();

        System.out.println("File content converted to uppercase.");
    }
}
