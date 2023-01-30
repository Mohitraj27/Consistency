//Inside a javax package swing application is imported.
//Program using concept of JLabel for placing text in a container.
import javax.swing.*;
class Day_127
{
    public static void main(String args[])
    { 
        //JFrame class is used and a object J1 is created 
        //Inside the frame what string should be displayed 
        //is to be mentioned
        JFrame J1=new JFrame("Java Swing Application ");
        //JLabel is for adding text in a frame 
        //two variables L1 and L2 is declared
        JLabel L1,L2;
        
        L1=new JLabel("First Label");
        //boundaries w.r.t frame is set 
        //for first and second label along with the text.
        L1.setBounds(50,50, 100,30);
        L2=new JLabel("Second Label");
        L2.setBounds(50,120, 100,30);  
        //JFRAMe size width and height is set 
       J1.setSize(400,400);
       
       J1.setLayout(null);
       J1.setVisible(true);
       //to add the two text inside frame we've used .add(object name);
       J1.add(L1);
       J1.add(L2);
    }
}