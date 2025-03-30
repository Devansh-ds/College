import testpackage.Foundation;

public class Exp26 {
    public static void main(String[] args) {
        Foundation obj = new Foundation();
        // System.out.println(obj.var1); // Not accessible (private)
        // System.out.println(obj.var2); // Not accessible (default, different package)
        // System.out.println(obj.var3); // Not accessible (protected, different package without inheritance)
        System.out.println("var4 (public) = " + obj.var4); // Accessible

        obj.display(); // Will display only accessible variables
    }
}
