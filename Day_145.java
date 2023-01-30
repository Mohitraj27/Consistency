//Implementation of JRadioButton class ,and how to choose multiple options
import javax.swing.*;
class Day_145
{
    JFrame f;
    Day_145(){
      f=new JFrame();
      //inside a JFrame RadioButton is created with args Male & Female
      JRadioButton r1=new JRadioButton("A.) Male");
      JRadioButton r2=new JRadioButton("A.) Female");
      //x-ordinate,y-ordinate,width,height is adjusted
      r1.setBounds(75,50,100,30);
      r2.setBounds(75,100,100,30);
      //Button group is created and added in JRadioButtons r1,r2
      ButtonGroup bg=new ButtonGroup();
      bg.add(r1);
      bg.add(r2);
      f.add(r1);
      f.add(r2);
      f.setSize(300,300);
      f.setLayout(null);
      f.setVisible(true);
    }
    public static void main(String args[])
    { //constuctor is called
        new Day_145();
    }
}