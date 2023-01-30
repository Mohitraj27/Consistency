//JTextField class is a text component that allows the editing of 
//a single line text. It inherits JTextComponent class.
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
class Day_128
{
    public static void main(String args[])
    {
        JFrame frame1=new JFrame("Learning Java TField");
        JTextField t1,t2;
        t1=new JTextField("Java Coding");
        t1.setBounds(50,100,200,30);
        t2=new JTextField("Java Swing");
        t2.setBounds(50,150,200,30);
        frame1.add(t1);
        frame1.add(t2);
        frame1.setSize(400,400);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
}