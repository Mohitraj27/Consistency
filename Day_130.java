//JTextArea class is a multi line region that displays text. It allows the 
//editing of multiple line text. It inherits JTextComponent class
import javax.swing.*;
class Day_130
{
    Day_130()
        {
            //Jframe class is created with object f
        JFrame f=new JFrame();
        //JTextArea class is created with area object
        JTextArea area =new JTextArea("Java Text Area Class Declaration");
        //Boundaries is set for objects area
        area.setBounds(10,30,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setVisible(true);
        }
    
    public static void main(String args[])
    {
        new Day_130();
        }
}