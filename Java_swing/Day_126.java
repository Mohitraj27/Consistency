//JButton with Action Listener
import javax.swing.*;
import java.awt.event.*;
class Day_126
{
    public static void main(String args[])
    {
        JFrame ob=new JFrame("Button ");
        final JTextField tf=new JTextField();
        //tf is a object for textfield
        //creating a boundaries for textfields
        tf.setBounds(50,50,150,20);
        JButton ob2=new JButton("Click Here");
        //now creating the boundaris of the button with the screen
        ob2.setBounds(50,100,95,30);
        ob2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Java Swing ");
            }
        });
        ob.add(ob2);
        ob.add(tf);
        ob.setSize(200,200);
        ob.setLayout(null);
        ob.setVisible(true);
    }
}