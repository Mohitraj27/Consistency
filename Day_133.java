//Concept of Login Password Interface using JPasword textfield and JTextfield 
import javax.swing.*;    
import java.awt.event.*;  
public class Day_133 {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("Login Password Interface"); 
    
    //adding label inside Jframe 
     final JLabel label = new JLabel();    
     //adding boundaries x,ysubordinate ,width,height
     label.setBounds(20,150, 200,50);  
     //adding PasswordText Field for taking user input
     final JPasswordField value = new JPasswordField();   
     value.setBounds(100,75,100,30);   
     //adding label username inside Jframe with Boundaries
     JLabel l1=new JLabel("Username:");    
        l1.setBounds(20,20, 80,30);    
        //adding another label Password with JFrame
        JLabel l2=new JLabel("Password:");    
        l2.setBounds(20,75, 80,30);    
        
        //adding LoginButton inside JFrame
        JButton b = new JButton("Login");  
        b.setBounds(100,120, 80,30);   
        //adding Java TextField class inside JFrame
        final JTextField text = new JTextField();  
        text.setBounds(100,20, 100,30);    
                f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b); f.add(text);  
               //.setSize for the display of output size
                f.setSize(300,300);    
                f.setLayout(null);    
                f.setVisible(true); 
                //adding on click listener on login Button
                b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) { 
                    //extracting the user input username and password 
                   String data = "Username " + text.getText();  
                   data += ", Password: "   
                   + new String(value.getPassword());   
                   label.setText(data);          
                }  
             });   
}  
}  
    




