//Concept of JComboBox class is used for dropdown menu.
import javax.swing.*;
import java.awt.event.*;
class Day_136
{
    JFrame f;
    //Constructed is created 
    Day_136(){
        //Frame is Created 
        f=new JFrame("ComboBox Example");
        //Label is created inside the frame
        final JLabel label=new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        //Button is added inside the frame
        JButton b=new JButton("Show");
        //width,height is adjusted for buttons
        b.setBounds(200,100,75,20);
        //list of strings is stored inside String array
        String Country[]={"India","Aus","U.S.A","England","Newzealand"};
        //JComboBox will create a dropdown menu for list of strings array
        JComboBox cb=new JComboBox(Country);
        //Boundary is set for JComboBox
        cb.setBounds(50,50,90,20);
        f.add(b);
        f.add(label);
        f.add(cb);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,500);
        //.addActionListner is created for the button 
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Message will be displayed on Click Listener
                String data="Country Selected:"
                +cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String args[])
    {
        //Constructor is called
        new Day_136();
    }
}