

import java.applet.Applet;
import java.awt.*;

public class HelloWorldApplet extends Applet {
    public void init() {
        setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello World", 50, 50);

        // Display name in status bar
        showStatus("Devansh - Applet Example");
    }
}
