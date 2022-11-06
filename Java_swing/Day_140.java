//Implementation of ScrollBar class 
import javax.swing.*;
import java.awt.event.*;
class Day_140
{
    Day_140(){
        JFrame f=new JFrame("Concept of Scrollbar Example");
        final JLabel label=new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        final JScrollBar s=new JScrollBar();
        s.setBounds(100,100,50,100);
        f.add(label);
        f.add(s);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
        s.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e){
                label.setText("Vertical Scrollbar value is:"+s.getValue());
            }
        });
    }
    public static void main(String args[])
    {
        new Day_140();
    }
}
