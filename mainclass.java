import package1.*;

import  javax.swing.*;

public class mainclass {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        new startpage();
    }
}
//    String[] a = {"Ankit Choudhary","Mittul Daswani","Aarya Devanai"};
//    String[] b={"4375 1111 2222 1234","1234 5678 9012 3456","4322 1232 0000 0001"};