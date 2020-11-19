package package1;
import javax.swing.*;
public class deposit{
	        

       
        // deposit(String s){
	// 	super(s);
	// }
	public deposit(){
                JFrame f3=new JFrame("DEPOSIT");
                JButton b=new JButton("DEPOSIT");
                JLabel l4=new JLabel("Enter the amount you want to deposit");
                l4.setBounds(40,50, 300,60); 
                JTextField t3=new JTextField();
                t3.setBounds(100,100,100,30);
                b.setBounds(120,150, 90, 30);
               // String deposit =t3.getText();
                f3.add(b);
                f3.add(l4);
                f3.add(t3);
                f3.setSize(400,400);  
                f3.setLayout(null);  
                f3.setVisible(true); 
                f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
} 
// 		double input_deposit;
// 		System.out.println("enter input");
// 		input_deposit=sc.nextFloat();
// 		try{
// 			if(input_deposit>100000)
// 			{
// 				deposit e=new deposit("cannot deposit this amount in one sitting please try it multiple times");
// 				throw e;
	
// 			}
// 			else
// 				System.out.println("deposit successful");
// 		}
// 		catch(deposit e){
// 			System.out.println(e);
// 		}
		
// 	}
// }
		