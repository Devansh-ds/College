import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JApplet implements ActionListener {
    JTextField display;
    String num1 = "", num2 = "", operator = "";

    public void init() {
        setLayout(new BorderLayout());
        display = new JTextField();
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String buttons[] = { "7", "8", "9", "/", "4", "5", "6", "*",
                             "1", "2", "3", "-", "0", "C", "=", "+" };

        for (String b : buttons) {
            JButton button = new JButton(b);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        if ("0123456789".contains(text)) {
            if (operator.equals("")) {
                num1 += text;
            } else {
                num2 += text;
            }
            display.setText(num1 + operator + num2);
        } else if (text.equals("C")) {
            num1 = num2 = operator = "";
            display.setText("");
        } else if (text.equals("=")) {
            if (!num1.isEmpty() && !num2.isEmpty()) {
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int result = 0;
                
                // Traditional switch case (Java 8 compatible)
                switch (operator) {
                    case "+": result = n1 + n2; break;
                    case "-": result = n1 - n2; break;
                    case "*": result = n1 * n2; break;
                    case "/": result = (n2 != 0) ? (n1 / n2) : 0; break;
                }
                
                display.setText(String.valueOf(result));
                num1 = String.valueOf(result);
                num2 = operator = "";
            }
        } else {
            if (!num1.isEmpty()) {
                operator = text;
                display.setText(num1 + operator);
            }
        }
    }
}
