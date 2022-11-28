//Implemetation of TitleBar icon in Java AWT
import java.awt.*;     
class Day_160 {     
Day_160(){     
Frame f=new Frame();     
Image icon = Toolkit.getDefaultToolkit().getImage("icon.jpeg");    
f.setIconImage(icon);    
f.setLayout(null);     
f.setSize(400,400);     
f.setVisible(true);     
}     
public static void main(String args[]){     
new Day_160();     
}     
} 