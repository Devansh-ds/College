class AThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("A");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class BThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("B");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Exp44 {
    public static void main(String[] args) {
        new AThread().start();
        new BThread().start();
    }
}
