//Food order System
//using the concept of JCheckBox ,JOptionPane,DialogBox ,JLabel and ActionListner with JButton
import javax.swing.*;
import java.awt.event.*;
class Day_134 extends JFrame implements ActionListener
{
        JLabel l1;
        JCheckBox cb1,cb2,cb3;
        JButton b;
        Day_134(){
        JFrame f=new JFrame("Food Order System");
         l1=new JLabel("Select your Food");
        l1.setBounds(50,50,300,20);
        //first Check box for pizza
        cb1=new JCheckBox("Pizza @ 100");
        cb1.setBounds(100,100,150,20);
        //second check box for Burger
        cb2=new JCheckBox("Burger @30");
        cb2.setBounds(100,150,150,20);
        //third check box for Tea
        cb3=new JCheckBox("Tea @ 10");  
        cb3.setBounds(100,200,150,20); 
        //Button for Order 
        b=new JButton("Order");
        b.setBounds(100,250,80,30);
        b.addActionListener(this);
             add(l1);add(cb1);add(cb2);add(cb3);add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
         }
     public void actionPerformed(ActionEvent e)
    {
        float amount=0;
        String msg="";
        //on selecting first check box amount 100 is added in float variable
        if(cb1.isSelected()){
            amount+=100;
            msg="Pizza 100\n";
        }//on selecting second check box aount 30 is added
        if(cb2.isSelected()){
            amount+=30;
            msg+="Burger: 30\n";
        }
        if(cb3.isSelected()){
            amount+=10;
            msg+="Tea: 10\n";
        }
        //after display space line 
        msg+="-----------\n";
        //Message Dialog pane is used for the total
         JOptionPane.showMessageDialog(this,msg+"Total:"+amount);
    }
    public static void main(String args[])
    {//constructor is called 
        new Day_134();
    }
}