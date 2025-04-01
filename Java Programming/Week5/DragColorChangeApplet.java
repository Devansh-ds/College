import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DragColorChangeApplet extends Applet {
    public void init() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                setBackground(Color.CYAN);
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                setBackground(Color.WHITE);
                repaint();
            }
        });
    }
}
