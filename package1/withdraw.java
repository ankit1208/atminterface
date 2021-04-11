package package1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class withdraw {

    public static double withdraw3 = 0;

    public withdraw() {
        JFrame f3 = new JFrame("withdraw");
        JButton b = new JButton("Withdraw");
        JButton b2 = new JButton("Back");
        JLabel l4 = new JLabel("Enter the amount you want to withdraw");
        l4.setBounds(40, 50, 300, 60);
        JTextField t3 = new JTextField();
        t3.setBounds(100, 100, 100, 30);
        b.setBounds(80, 150, 90, 30);
        b2.setBounds(190, 150, 80, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f3.dispose();


                String withdraw1 = t3.getText();
                double withdraw2 = Double.parseDouble(withdraw1);

                if (withdraw2 > 50000) {
                    JOptionPane.showMessageDialog(null, "this amount cannot be withdrawn in one sitting",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    System.out.println("rupees" + withdraw2 + "cannot be withdrawn at one go please try again later");
                } else if ((deposit.check(withdraw2) == true)) {

                    JOptionPane.showMessageDialog(null, "insufficent balance",
                            "ERROR", JOptionPane.ERROR_MESSAGE);

                    System.out.println("error");
                }
                else if((withdraw2 < 0)){
                    JOptionPane.showMessageDialog(null, "error",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    double withdraw3 = withdraw2;
                    balance.balance1 = balance.balance1 - withdraw3;
                    JOptionPane.showMessageDialog(null, "rupees " + withdraw3 + " has been withdrawn");
                    System.out.println("rupees" + withdraw3 + "is withdrawn");
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
} 