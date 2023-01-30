//For displaying image, we can use the method drawImage() of Graphics class.
//Syntax of drawImage() method:
import javax.swing.JFrame;  
import java.awt.*;  
public class Day_151 extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("p3.gif");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        Day_151 m=new Day_151();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  