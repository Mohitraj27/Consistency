  
//Java Dialog Interface class with border
 import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   class Day_147{
       private static JDialog d;
       //constructor is created
       Day_147(){
           //New Frame class is constructed with object f
           JFrame f=new JFrame();
           d=new JDialog(f,"Dialog Example",true);
           d.setLayout(new FlowLayout());
           //New JavaButton class is used
           JButton b=new JButton("OK");
           b.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e)
               {
                Day_147.d.setVisible(false);
               }
           });
           //inside the dialog Interface new Jlabel is added
           d.add(new JLabel("Click button to continue"));
           d.add(b);
           d.setSize(300,300);
           d.setVisible(true);
       }
       
       public static void main(String args[])
       {
           //constructor is called
           new Day_147();
       }
   }