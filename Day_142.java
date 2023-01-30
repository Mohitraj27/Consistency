//Implementation of JSlider class to create the slider.user can select value 
//from a specific range
import javax.swing.*;
class Day_142 extends JFrame
{
    Day_142(){
        JSlider slider=new JSlider(JSlider.HORIZONTAL,0,50,25);
        //JSlider max and min value with tick spacing
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
    
        JPanel panel=new JPanel();
        panel.add(slider);
        add(panel);
    }
    public static void main(String s[])
    {
        
        Day_142 frame=new Day_142();
        frame.pack();
        frame.setVisible(true);
    }
}