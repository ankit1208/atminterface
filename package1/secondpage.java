package package1;

import javax.swing.*;

public class secondpage {
    secondpage(){
        JFrame f= new JFrame("login signup");
        JButton b1= new JButton("login");
        JButton b2=new JButton("signup");
        b1.setBounds(30,100,80,30);
        b2.setBounds(160,100,80,30);

        b1.addActionListener(e->{

            f.dispose();
            new GUI();
        });
        b2.addActionListener(e->{
            f.dispose();
            new signup();
        });
        f.add(b1);
        f.add(b2);
        f.setSize(310, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new secondpage();
    }
}
