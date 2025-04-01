import java.applet.Applet;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorChangeApplet extends Applet {

    // Initialize the Applet with a white background
    @Override
    public void init() {
        setBackground(Color.WHITE);
        
        // Add mouse listener to handle dragging
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Change background to cyan when the mouse is pressed
                setBackground(Color.CYAN);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Revert background to white when the mouse is released
                setBackground(Color.WHITE);
            }
        });

        // Add mouse motion listener to detect dragging
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Keep background cyan while dragging
                setBackground(Color.CYAN);
            }
        });
    }
}
