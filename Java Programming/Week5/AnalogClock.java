import java.applet.*;
import java.awt.*;
import java.util.Calendar;

public class AnalogClock extends Applet implements Runnable {
    Thread t;
    int centerX, centerY;

    public void init() {
        setBackground(Color.WHITE);
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        centerX = getWidth() / 2;
        centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 20;

        // Draw clock circle
        g.setColor(Color.BLACK);
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        drawHand(g, hour * 30 + minute / 2, radius - 40, 5, Color.BLACK);  // Hour hand
        drawHand(g, minute * 6, radius - 20, 3, Color.BLUE);               // Minute hand
        drawHand(g, second * 6, radius - 10, 2, Color.RED);                // Second hand
    }

    private void drawHand(Graphics g, double angle, int length, int width, Color color) {
        double rad = Math.toRadians(angle - 90);
        int x = (int) (centerX + length * Math.cos(rad));
        int y = (int) (centerY + length * Math.sin(rad));

        g.setColor(color);
        g.drawLine(centerX, centerY, x, y);
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
