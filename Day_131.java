//JPasswordField class is a text component specialized for password entry. 
//It allows the editing of a single line of text. 
//It inherits JTextField class.
import javax.swing.*;
class Day_131
{
    public static void main(String args[])
    {
        JFrame f1=new JFrame("Java Password Field ");
        JPasswordField value=new JPasswordField();
        JLabel l1=new JLabel("Password");
        //.setBounds(x,y,width,height);
        // x and y are the two coordinates of upper left corner of 
        //components
        l1.setBounds(20,100,80,30);
        value.setBounds(100,100,100,30);
        f1.add(value);
        f1.add(l1);
        f1.setSize(300,300);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setBounds(20,100,100,100);
    }
}