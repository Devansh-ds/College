import java.applet.Applet;
import java.awt.*;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(20, 20, 180, 20); // Line

        g.setColor(Color.GREEN);
        g.drawRect(20, 40, 100, 50); // Rectangle

        g.setColor(Color.BLUE);
        g.fillRect(140, 40, 100, 50); // Filled Rectangle

        g.setColor(Color.YELLOW);
        g.drawRoundRect(20, 100, 100, 50, 20, 20); // Rounded Rectangle

        g.setColor(Color.CYAN);
        g.fillOval(140, 100, 100, 50); // Filled Oval

        g.setColor(Color.MAGENTA);
        g.drawArc(20, 160, 100, 50, 0, 180); // Arc

        g.setColor(Color.ORANGE);
        int x[] = {50, 70, 90, 110, 130};
        int y[] = {250, 220, 200, 220, 250};
        g.drawPolygon(x, y, 5); // Polygon
    }
}
