public class Exp19 {
    public static void main(String[] args) {
        System.out.println("2^3 = " + Calculator.powerInt(2, 3));
        System.out.println("2.5^3 = " + Calculator.powerDouble(2.5, 3));
    }
}

class Calculator {
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}