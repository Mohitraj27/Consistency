//Concept of JOption Pane showInputDialog()
import javax.swing.*;
class Day_139
{
    JFrame f;
    Day_139()
    {
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"Enter Name");
    }
    public static void main(String argsp[])
    {
        new Day_139();
    }
}