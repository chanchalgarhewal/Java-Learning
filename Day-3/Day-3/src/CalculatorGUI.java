import javax.swing.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1 = new JTextField();
        t1.setBounds(50, 30, 120, 30);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(200, 30, 120, 30);
        frame.add(t2);

        JLabel result = new JLabel("Result: ");
        result.setBounds(50, 310, 300, 30);
        frame.add(result);

        JButton add = new JButton("Add");
        add.setBounds(50, 80, 100, 30);
        frame.add(add);
        add.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a + b));
        });

        JButton sub = new JButton("Sub");
        sub.setBounds(200, 80, 100, 30);
        frame.add(sub);
        sub.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a - b));
        });
        JButton mul = new JButton("Mul");
        mul.setBounds(50, 130, 100, 30);
        frame.add(mul);
        mul.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a * b));
        });

        JButton div = new JButton("Div");
        div.setBounds(200, 130, 100, 30);
        frame.add(div);
        div.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            if (b != 0) {
                result.setText("Result: " + (a / b));
            } else {
                result.setText("Cannot divide by zero");
            }
        });

        JButton avg = new JButton("Avg");
        avg.setBounds(50, 180, 100, 30);
        frame.add(avg);
        avg.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Average: " + ((a + b) / 2));
        });

        JButton per = new JButton("%");
        per.setBounds(200, 180, 100, 30);
        frame.add(per);
        per.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            if (b != 0) {
                result.setText("Percentage: " + ((a / b) * 100) + "%");
            } else {
                result.setText("Cannot divide by zero");
            }
        });

        JButton mod = new JButton("Mod");
        mod.setBounds(125, 230, 100, 30);
        frame.add(mod);
        mod.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Modulus: " + (a % b));
        });

        frame.setVisible(true);
    }
}