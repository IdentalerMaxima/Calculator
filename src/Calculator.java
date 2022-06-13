import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    double firstNum = 0;
    String operation = null;
    double savedNum = 0;

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
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JButton del = new JButton("DEL");
    JButton clr = new JButton("CLR");
    JButton eql = new JButton("=");


    public void Start(){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(415, 533);
        frame.setLayout(null);


        textField.setFont(font);
        textField.setEditable(true);
        textField.setBounds(0, 0, 400, 100);
        textField.setBackground(Color.LIGHT_GRAY);
        frame.add(textField);

        buttons.setBounds(0, 100, 400, 400);
        buttons.setLayout(new GridLayout(4, 4, 0, 0));
        frame.add(buttons);


        num1.setBounds(0,200,100,100);
        num1.setFont(font2);
        num1.setFocusable(false);
        num1.setBackground(Color.LIGHT_GRAY);
        num1.addActionListener(this);
        buttons.add(num1);

        num2.setBounds(100,200,100,100);
        num2.setFont(font2);
        num2.setFocusable(false);
        num2.setBackground(Color.LIGHT_GRAY);
        num2.addActionListener(this);
        buttons.add(num2);

        num3.setBounds(200,200,100,100);
        num3.setFont(font2);
        num3.setFocusable(false);
        num3.setBackground(Color.LIGHT_GRAY);
        buttons.add(num3);

        sum.setBounds(300,200,100,100);
        sum.setFont(font2);
        sum.setFocusable(false);
        sum.setBackground(Color.LIGHT_GRAY);
        sum.addActionListener(this);
        buttons.add(sum);

        num4.setBounds(0,300,100,100);
        num4.setFont(font2);
        num4.setFocusable(false);
        num4.setBackground(Color.LIGHT_GRAY);
        buttons.add(num4);

        num5.setBounds(100,300,100,100);
        num5.setFont(font2);
        num5.setFocusable(false);
        num5.setBackground(Color.LIGHT_GRAY);
        buttons.add(num5);

        num6.setBounds(200,300,100,100);
        num6.setFont(font2);
        num6.setFocusable(false);
        num6.setBackground(Color.LIGHT_GRAY);
        buttons.add(num6);

        sub.setBounds(300,300,100,100);
        sub.setFont(font2);
        sub.setFocusable(false);
        sub.setBackground(Color.LIGHT_GRAY);
        buttons.add(sub);

        num7.setBounds(0,400,100,100);
        num7.setFont(font2);
        num7.setFocusable(false);
        num7.setBackground(Color.LIGHT_GRAY);
        buttons.add(num7);

        num8.setBounds(100,400,100,100);
        num8.setFont(font2);
        num8.setFocusable(false);
        num8.setBackground(Color.LIGHT_GRAY);
        buttons.add(num8);

        num9.setBounds(200,400,100,100);
        num9.setFont(font2);
        num9.setFocusable(false);
        num9.setBackground(Color.LIGHT_GRAY);
        buttons.add(num9);

        mul.setBounds(300,400,100,100);
        mul.setFont(font2);
        mul.setFocusable(false);
        mul.setBackground(Color.LIGHT_GRAY);
        buttons.add(mul);

        del.setBounds(0,500,100,100);
        del.setFont(font2);
        del.setFocusable(false);
        del.setBackground(Color.LIGHT_GRAY);
        buttons.add(del);

        num0.setBounds(100,500,100,100);
        num0.setFont(font2);
        num0.setFocusable(false);
        num0.setBackground(Color.LIGHT_GRAY);
        buttons.add(num0);

        div.setBounds(200,500,100,100);
        div.setFont(font2);
        div.setFocusable(false);
        div.setBackground(Color.LIGHT_GRAY);
        buttons.add(div);

        eql.setBounds(300,500,100,100);
        eql.setFont(font2);
        eql.setFocusable(false);
        eql.setBackground(Color.LIGHT_GRAY);
        eql.addActionListener(this);
        buttons.add(eql);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == num1){
            textField.setText(textField.getText() + "1");
            System.out.println("ok1");
        }
        if (e.getSource() == num2){
            textField.setText(textField.getText() + "2");
            System.out.println("ok2");
        }
        if (e.getSource() == sum){
            savedNum = Double.parseDouble(textField.getText() + textField.getText());
            operation = "sum";

            textField.setText("");

        }
        if (e.getSource() == eql){
            if (operation.equals("sum")) {
                textField.setText(String.valueOf(savedNum + Double.parseDouble(textField.getText())));
                operation = null;
            }
        }


    }
}
