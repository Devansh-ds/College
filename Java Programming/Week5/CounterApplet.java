import java.applet.Applet;
import java.awt.*;

public class CounterApplet extends Applet implements Runnable {
    private int count = 0;
    private Thread t;

    public void init() {
        setBackground(Color.LIGHT_GRAY);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            count++;
            repaint();
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.BLACK);
        g.drawString("Counter: " + count, 50, 100);
    }
}
