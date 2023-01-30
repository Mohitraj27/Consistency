//JTabbedPane class is used to switch between group of components(tab)
import javax.swing.*;
class Day_143
{
    JFrame f;
    //Constructor is created
    Day_143()
    {
        //Frame is created 
       f=new JFrame();
       //TextArea  is created for panel with width and height
       JTextArea ta=new JTextArea(200,200);
       JPanel p1=new JPanel();
       p1.add(ta);
       //TextArea is created for panel with width and height
       JTextArea ta1=new JTextArea(300,300);
       JPanel p2=new JPanel();
       p2.add(ta1);
       //TextArea is created for panel with width and height
       JTextArea ta2=new JTextArea(500,500);
       JPanel p3=new JPanel();
       p3.add(ta2);
       //taabed Pane class is created with tp object
       JTabbedPane tp=new JTabbedPane();
       tp.setBounds(50,50,200,200);
       tp.add("main",p1);
       tp.add("visit",p2);
       tp.add("help",p3);
       f.add(tp);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
    }
    public static void main(String args[])
    {
        //Constructor is called
        new Day_143();
    }
}