package package1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    public JButton b;
    JFrame f;
    public static JTextField t1;
    public static JTextField t2;
    public static String name1;
    public static String cardnumber;
    public static String[] a={"Ankit Choudhary", "Mittul Daswani", "Aarya Devanai"};
   public static String[] b1 = {"4375 1111 2222 1234", "1234 5678 9012 3456", "4322 1232 0000 0001"};
    public GUI() {
        f = new JFrame("Login");
        JLabel l1, l2;
        l1 = new JLabel("Enter Name");
        l1.setBounds(50, 50, 100, 30);
        t1 = new JTextField();
        t1.setBounds(180, 50, 150, 30);
        l2 = new JLabel("Enter Cardnumber");
        l2.setBounds(50, 100, 150, 70);
        t2 = new JTextField();
        t2.setBounds(180, 120, 200, 30);
        b = new JButton("Submit");
        b.setBounds(135, 190, 110, 30);
        b.addActionListener(this);
        f.add(b);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 400);
        f.setLayout(null);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        name1 = t1.getText();


        cardnumber = t2.getText();
        String[] k ;
        String[] l;
        k=signup.d;
        l=signup.b3;
        if (((name1.equals(a[0])) && (cardnumber.equals(b1[0]))) || ((name1.equals(a[1])) && (cardnumber.equals(b1[1]))) || ((name1.equals(a[2])) && (cardnumber.equals(b1[2])))||((name1.equals(k[3])) && (cardnumber.equals(l[3])))) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            new options();
            f.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "not registered in our database",
                    "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }

}
   