package package1;
import javax.swing.*;
import java.util.*;
import java.util.Arrays;

public class signup {
    public static String d[];
    public static String b3[];
    {
        Scanner sc =new Scanner(System.in);
        String[] c=GUI.a;
        d= Arrays.copyOf(c,c.length+1);
        String[] b2=GUI.b1;
        b3=Arrays.copyOf(b2,b2.length+1);
        JFrame f=new JFrame("signup");
        JLabel l1= new JLabel("Enter Name");
        l1.setBounds(20,50,150,30);
        JTextField t1=new JTextField();
        t1.setBounds(150,50,150,30);
        JLabel l2= new JLabel("Enter Cardnumber");
        l2.setBounds(20,100,150,30);
        JTextField t2=new JTextField();
        t2.setBounds(150,100,150,30);
        JButton b= new JButton("signup");

        b.setBounds(150,150,80,30);
        b.addActionListener(e-> {
            if(t1.getText().equals("")||t2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "enter credentials",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else {
            d[3] = t1.getText();
            b3[3] = t2.getText();
            new GUI();
            f.dispose();
        }

        });
        f.add(l1);f.add(l2);f.add(t1);f.add(t2);f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new signup();
    }
}
