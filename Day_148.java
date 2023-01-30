import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//JColor class is used to create a color chooser dialog box
class Day_148 extends JFrame implements ActionListener
{
    JButton b;
    Container c;
    Day_148(){
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }
    public void actionPerformed(ActionEvent e){
        Color initialcolor=Color.RED;
        Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
        c.setBackground(color);
    }
    public static void main(String args[])
    {
        Day_148 ch=new Day_148();
        ch.setSize(400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}