//Concept of JOptionPane class for message dialog boxes
import javax.swing.*;
class Day_137 
{
    
    JFrame f;
    //constructor is created
    Day_137(){
        //new frame class is added
        f=new JFrame();
        //JOptionPane message Dialog box is used
        JOptionPane.showMessageDialog(f,"Learning Concept of Message Dialog Box");
    }
    public static void main(String args[]){
        //constructor is called
        new Day_137();
    }
}
