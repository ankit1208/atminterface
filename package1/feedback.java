package package1;

import javax.swing.*;


public class feedback {
    feedback()  {
        JFrame f=new JFrame("feedback form");
        JLabel l=new JLabel("Did you like your experience with us.");
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        JTextArea area= new JTextArea();
        JCheckBox checkbox1 = new JCheckBox("yes");
        JCheckBox checkbox2 = new JCheckBox("no");
        l.setBounds(50,40,300,30);
        checkbox1.setBounds(150,80,50,50);
        checkbox2.setBounds(150,140,50,50);
        JButton b=new JButton("submit");
        JButton b2=new JButton("submit");
        b.setBounds(120,200,100,30);
        b.addActionListener(e->{
            if(checkbox2.isSelected())
            {
                checkbox1.setSelected(false);
                l2.setText("Would you like to give some suggestions");
                l2.setBounds(30,250,300,30);

                area.setBounds(20,300,250,360);
                b2.setBounds(120,700,100,30);
                b2.addActionListener(e13->{
                    if(area.getText().equals(""))
                    { JOptionPane.showMessageDialog(null,"we are sorry for your experience");}
                    else{
                        JOptionPane.showMessageDialog(null,"your suggestions are noted");
                    }
                    System.exit(0);
                });


            }
            if(checkbox1.isSelected())
            {
                checkbox2.setSelected(false);
                JOptionPane.showMessageDialog(null,"Thank you");
                System.exit(0);

            }
        });
        f.add(l);
        f.add(l2);
        f.add(l3);
        f.add(area);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(b);
        f.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws InterruptedException {
        new feedback();
    }
}
