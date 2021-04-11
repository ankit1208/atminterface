package package1;

import javax.swing.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Calendar;


public class genbill {

    genbill() {

        JFrame f5 = new JFrame("BILL");
        JLabel l5 = new JLabel("NAME:");
        l5.setBounds(20, 40, 100, 20);

        JLabel l6 = new JLabel();
        l6.setText(GUI.name1);
        l6.setBounds(130, 40, 100, 20);
        JLabel l7 = new JLabel("CardNumber:");
        l7.setBounds(20, 70, 120, 20);
        JLabel l8 = new JLabel();
        l8.setText(GUI.cardnumber);
        l8.setBounds(130, 70, 150, 20);
        JLabel l9 = new JLabel();
        l9.setText("Account Balance:");
        l9.setBounds(20, 100, 150, 20);
        JLabel l10 = new JLabel();
        l10.setText(String.valueOf(balance.balance1));
        l10.setBounds(130, 100, 150, 20);
        Calendar calendar = Calendar.getInstance();
        JLabel l11 = new JLabel();
        l11.setText("Time of bill:");
        l11.setBounds(20, 130, 150, 20);
        JLabel l12 = new JLabel();
        l12.setText(String.valueOf(calendar.getTime()));
        l12.setBounds(130, 130, 200, 20);
        System.out.println("time of bill= " + calendar.getTime());
        JButton b = new JButton("print");
        b.setBounds(200, 160, 90, 30);
        b.addActionListener(e1 -> {
            PrinterJob printJob = PrinterJob.getPrinterJob();
            if (printJob.printDialog()) {
                try {
                    printJob.print();
                } catch (PrinterException prt) {
                    prt.printStackTrace();
                }
            }
        });
        JButton b1 = new JButton("back");
        b1.setBounds(110, 160, 80, 30);
        b1.addActionListener(e1 -> {
            f5.dispose();
            new options();
        });
        f5.add(l5);
        f5.add(l6);
        f5.add(l7);
        f5.add(l8);
        f5.add(l9);
        f5.add(l10);
        f5.add(l11);
        f5.add(l12);
        f5.add(b);
        f5.add(b1);
        f5.setSize(400, 400);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

