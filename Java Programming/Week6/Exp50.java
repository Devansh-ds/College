import java.io.*;

public class Exp50 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Devan/College/basic.txt");

        // Write to the file
        FileWriter fw = new FileWriter(file);
        fw.write("This is a basic file write operation.");
        fw.close();
        System.out.println("Data written to basic.txt");

        // Read the file
        FileReader fr = new FileReader(file);
        int ch;
        System.out.println("Reading content from basic.txt:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
