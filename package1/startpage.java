package package1;

import javax.swing.*;

public class startpage {
    public startpage() {
        JFrame f = new JFrame("START PAGE");
        JLabel l = new JLabel();
        JButton b = new JButton();
        b.setIcon(new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\card.jpeg"));
        l.setIcon(new ImageIcon("C:\\Users\\Ankit\\Desktop\\oopatm\\package1\\starticon.jpeg"));
        l.setBounds(0, 0, 554, 554);
        b.setBounds(60, 500, 320, 520);
        b.addActionListener(e1 -> {
            f.dispose();
            new secondpage();
        });
        f.add(l);
        f.add(b);
        f.setSize(554, 1100);
        f.setLayout(null);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new startpage();


    }
}
