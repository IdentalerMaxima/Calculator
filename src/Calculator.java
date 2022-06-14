import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Calculator V1");

    JTextField textField = new JTextField(9);
    Font font = textField.getFont().deriveFont(Font.PLAIN, 50f);
    Font font2 = textField.getFont().deriveFont(Font.PLAIN, 20f);

    JPanel buttons = new JPanel();
    JButton num0 = new JButton("0");
    JButton num1 = new JButton("1");
    JButton num2 = new JButton("2");
    JButton num3 = new JButton("3");
    JButton num4 = new JButton("4");
    JButton num5 = new JButton("5");
    JButton num6 = new JButton("6");
    JButton num7 = new JButton("7");
    JButton num8 = new JButton("8");
    JButton num9 = new JButton("9");

    JButton sum = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("x");

    JButton del = new JButton("DEL");
    JButton clr = new JButton("CLR");
    JButton eql = new JButton("=");

    JButton dot = new JButton(".");
    JButton neg = new JButton("+/-");
    JButton sqr = new JButton("x^2");
    JButton div = new JButton("/");

    public void Start() {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(415, 633);
        frame.setLayout(null);

        textField.setFont(font);
        textField.setEditable(true);
        textField.setBounds(0, 0, 400, 100);
        textField.setBackground(Color.LIGHT_GRAY);
        frame.add(textField);

        buttons.setBounds(0, 100, 400, 500);
        buttons.setLayout(new GridLayout(5, 4, 0, 0));
        frame.add(buttons);

        JButton[] Abuttons = new JButton[]{
                dot, neg, sqr, div,
                num1, num2, num3, sum,
                num4, num5, num6, sub,
                num7, num8, num9, mul,
                del, num0, clr, eql};
        for (JButton button : Abuttons) {
            button.setFont(font2);
            button.addActionListener(this);
            button.setBackground(Color.LIGHT_GRAY);
            button.setFocusable(false);
            buttons.add(button);
        }
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clr) {
            textField.setText("");
        }
        if (e.getSource() == del) {
            String text = textField.getText();
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }

        if (e.getSource() == dot) {
            String text = textField.getText();
            if (!text.contains(".")) {
                textField.setText(text + ".");
            }
        }

        if (e.getSource() == num1) {
                textField.setText(textField.getText() + "1");
        }
        if (e.getSource() == num2) {
                textField.setText(textField.getText() + "2");
        }
    }
}
