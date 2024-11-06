import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Calculator logic
class Calculate {

    float sum(float a, float b) {
        return a + b;
    }

    float sub(float a, float b) {
        return a - b;
    }

    float div(float a, float b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Division by 0 is not possible");
            return Float.POSITIVE_INFINITY;
        }
    }

    float mul(float a, float b) {
        return a * b;
    }
}

// UI for Calculator
class UI implements ActionListener {
    
    JFrame frame;
    JTextField screen;
    float a, b, result;
    String operator;
    Calculate calc;
    
    // Buttons for digits and operations
    JButton one, two, three, four, five, six, seven, eight, nine, zero;
    JButton sum, sub, div, mul, equals, clear;

    public UI() {
        // Frame and screen setup
        frame = new JFrame("Calculator");
        screen = new JTextField(16);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false);
        screen.setPreferredSize(new Dimension(300, 50));
        
        calc = new Calculate();

        // Creating number buttons
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");

        // Creating operator buttons
        sum = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equals = new JButton("=");
        clear = new JButton("C");

        // Adding Action Listeners to buttons
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        sum.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);

        // Creating a panel to add buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        
        // Adding buttons to panel
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(sum);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(sub);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(mul);
        panel.add(clear);
        panel.add(zero);
        panel.add(equals);
        panel.add(div);

        // Adding screen and panel to frame
        frame.add(screen, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Handling button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            screen.setText("");
            a = b = result = 0;
            operator = "";
        } else if (command.equals("=")) {
            b = Float.parseFloat(screen.getText());
            switch (operator) {
                case "+":
                    result = calc.sum(a, b);
                    break;
                case "-":
                    result = calc.sub(a, b);
                    break;
                case "*":
                    result = calc.mul(a, b);
                    break;
                case "/":
                    result = calc.div(a, b);
                    break;
            }
            screen.setText(String.valueOf(result));
        } else if ("0123456789".contains(command)) {
            screen.setText(screen.getText() + command);
        } else {
            a = Float.parseFloat(screen.getText());
            operator = command;
            screen.setText("");
        }
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        new UI();
    }
}
	

