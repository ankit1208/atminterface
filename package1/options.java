package package1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class options implements ActionListener {
    JFrame f2;

    options() {

        f2 = new JFrame("the options we provide");
        JButton b1 = new JButton("Deposit");
        JButton b2 = new JButton("Withdraw");
        JButton b3 = new JButton("Balance");
        JButton b4 = new JButton("Receipt");
        JButton b5 = new JButton("EXIT");
        JLabel l1 = new JLabel();
        JLabel l6 = new JLabel();
        JLabel l7 = new JLabel();
        JLabel l8 = new JLabel();
        JLabel l9 = new JLabel();

        l1.setBounds(300, 220, 180, 80);
        l6.setBounds(300, 70, 180, 80);
        l6.setIcon(new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\depositicon.jpeg"));
        l7.setBounds(300, 370, 180, 80);
        l7.setIcon(new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\balanceicon.jpeg"));
        l8.setBounds(300, 520, 180, 80);
        l8.setIcon(new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\receipt.jpeg"));
        l9.setBounds(300, 670, 180, 80);
        l9.setIcon(new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\exiticon.jpeg"));
        ImageIcon with;
        with = new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\withdrawicon.jpeg");
        l1.setIcon(with);

        b1.setBounds(100, 70, 160, 80);
        b1.addActionListener(e14 -> {
            new deposit();
            f2.dispose();
        });
        b2.setBounds(100, 220, 160, 80);
        b2.addActionListener(e13 -> {

            new withdraw();
            f2.dispose();

        });
        b3.setBounds(100, 370, 160, 80);
        b3.addActionListener(e12 -> {
            new balance();
        });
        b4.setBounds(100, 520, 160, 80);
        b4.addActionListener(e17 -> {
            new  genbill();
            f2.dispose();


        });
        b5.setBounds(100, 670, 160, 80);
        b5.addActionListener(e1 -> {
            int result = JOptionPane.showConfirmDialog(null,"would you like to fill a feedback form", "Swing Tester",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                f2.dispose();
               new feedback();
            }
            else {
                System.exit(0);
            }
        });
        f2.add(b1);
        f2.add(b2);
        f2.add(b3);
        f2.add(b4);
        f2.add(b5);
        f2.add(l1);
        f2.add(l6);
        f2.add(l7);
        f2.add(l8);
        f2.add(l9);


        f2.setSize(550, 800);
        f2.setLayout(null);

        f2.setVisible(true);

        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
