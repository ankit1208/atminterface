 package package1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class GUI implements ActionListener
{  
    public JButton b;
public GUI()
    
{
    

    JFrame f= new JFrame("create account");  
    JLabel l1,l2;  
    JTextField t1,t2;
    l1=new JLabel("Enter Name");  
    l1.setBounds(50,50, 100,30);  
    t1=new JTextField();
    t1.setBounds(180,50,150,30);
    l2=new JLabel("Enter Cardnumber"); 
    l2.setBounds(50,100, 150,70); 
    t2=new JTextField();
    t2.setBounds(180,120,200,30);
     b=new JButton("Submit");  
    b.setBounds(135,190,110,30);  
     b.addActionListener(this);
    f.add(b);  
    f.add(l1); f.add(l2);
    f.add(t1); f.add(t2); 
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public void actionPerformed(ActionEvent e) { 
        JFrame f2=new JFrame("the options we provide");
        JButton b1=new JButton("Deposit");
        JButton b2=new JButton("Withdraw");
        JButton b3=new JButton("Balance");
        JButton b4=new JButton("Exit");
        b1.setBounds(130, 20, 120, 50);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
                new deposit(); 
            }
            });
        b2.setBounds(130, 80, 120, 50);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             new withdraw(); 
                // JFrame f4=new JFrame("WITHDRAW");
                // JLabel l5=new JLabel("Enter the amount you want to withdraw");
                // l5.setBounds(40,50, 300,60); 
                // JTextField t4=new JTextField();
                // t4.setBounds(100,100,100,30);
                // f4.add(l5);
                // f4.add(t4);
                // f4.setSize(400,400);  
                // f4.setLayout(null);  
                // f4.setVisible(true); 
                // f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

            }
            });
        b3.setBounds(130, 140, 120, 50);
        b4.setBounds(130, 200, 120, 50);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                System.exit(0);
            }
            });
        f2.add(b1);
        f2.add(b2);
        f2.add(b3);
        f2.add(b4);


        

    f2.setSize(400,400);  
    f2.setLayout(null);  
    f2.setVisible(true); 
    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    }
    public static void main(String[] args) {
        new GUI();
    }
    

}  