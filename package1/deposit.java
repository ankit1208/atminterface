package package1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deposit extends JFrame {
    public static double deposit4 = 0;
    private String deposit2 = "";
     private double deposit3 = 0;
   private  JFrame f3;

    public deposit() {

        f3 = new JFrame("DEPOSIT");
        JButton b = new JButton("DEPOSIT");
        JButton b2 = new JButton("Back");
        JLabel l4 = new JLabel("Enter the amount you want to deposit");
        l4.setBounds(40, 50, 300, 60);
        JTextField t3 = new JTextField();
        t3.setBounds(100, 100, 100, 30);
        b.setBounds(60, 150, 90, 30);
        b2.setBounds(180, 150, 80, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                deposit2 = t3.getText();
                deposit3 = Double.parseDouble(deposit2);
                if (deposit3 > 100000) {

                    JOptionPane.showMessageDialog(null, "this amount cannot be deposited in one sitting",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                } else if (deposit3 < 0) {
                    JOptionPane.showMessageDialog(null, "invalid number",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    deposit4 = deposit3;
                    balance.balance1 = balance.balance1 + deposit4;
                    JOptionPane.showMessageDialog(null, "rupees " + deposit4 + " has been deposited");
                    System.out.println("rupees:" + deposit4 + " has been deposited");
                    f3.dispose();


                }
                new options();

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                new options();
            }
        });


        f3.add(b);
        f3.add(b2);
        f3.add(l4);
        f3.add(t3);
        f3.setSize(400, 400);
        f3.setLayout(null);
        f3.setVisible(true);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static boolean check(double abc) {


        if (abc > balance.balance1) {
            System.out.println(balance.balance1);
            return true;

        } else {
            return false;
        }

    }
}
