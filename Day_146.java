//Java JRadioButton Example with ActionListener
import javax.swing.*;    
import java.awt.event.*;    
class Day_146 extends JFrame implements ActionListener{    
JRadioButton rb1,rb2;    
JButton b;    
//constructor is created
 Day_146(){   
    //Java Radio Buttons
rb1=new JRadioButton("Male");    
rb1.setBounds(100,50,100,30);      
rb2=new JRadioButton("Female");    
rb2.setBounds(100,100,100,30);    
//Button Group added for Java Buttons
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);    
b=new JButton("click");    
b.setBounds(100,150,80,30);  
//Action Listner is implemented  
b.addActionListener(this);    
add(rb1);add(rb2);add(b);    
setSize(300,300);    
setLayout(null);    
setVisible(true);    
}    
//Method to call Action Listener
public void actionPerformed(ActionEvent e){    
if(rb1.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Male.");    
}    
if(rb2.isSelected()){    
    //Dialog Box appears on CLick
JOptionPane.showMessageDialog(this,"You are Female.");    
}    
}    
public static void main(String args[]){    
    //Constructor is called
new Day_146();    
}} 