package package1;
import javax.swing.*;
public class withdraw{
	
        // deposit(String s){
	// 	super(s);
	// }
	public withdraw(){
                JFrame f3=new JFrame("withdraw");
                JButton b=new JButton("Withdraw");
                JLabel l4=new JLabel("Enter the amount you want to deposit");
                l4.setBounds(40,50, 300,60); 
                JTextField t3=new JTextField();
                t3.setBounds(100,100,100,30);
                b.setBounds(120,150, 90, 30);
               // String  =t3.getText();
                f3.add(b);
                f3.add(l4);
                f3.add(t3);
                f3.setSize(400,400);  
                f3.setLayout(null);  
                f3.setVisible(true); 
                f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
} 