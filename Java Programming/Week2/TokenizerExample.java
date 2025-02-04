import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String str = "Java is an Object-Oriented Programming Language";
        StringTokenizer tokenizer = new StringTokenizer(str);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
