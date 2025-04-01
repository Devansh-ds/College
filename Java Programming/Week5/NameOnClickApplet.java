import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class NameOnClickApplet extends Applet implements MouseListener {
    private String message = "";

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(message, 50, 50);
    }

    public void mouseClicked(MouseEvent e) {
        message = "Devansh";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
