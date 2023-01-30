//JToggle Button implementation
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.event.ItemEvent;

class Day_149 extends JFrame implements ItemListener{
    public static void main(String args[])
    {
        new Day_149();
    }
 
    private JToggleButton button;
    Day_149(){
        setTitle("JToggleButton with Item Listner Example");
        setLayout(new FlowLayout());  
        setJToggleButton();  
        setAction();  
        setSize(200, 200);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
     private void setJToggleButton() {  
        button = new JToggleButton("ON");  
        add(button);  
    }  
    private void setAction() {  
        button.addItemListener(this);  
    }  
    public void itemStateChanged(ItemEvent eve) {  
        if (button.isSelected())  
            button.setText("OFF");  
        else  
            button.setText("ON");  
    }  
}