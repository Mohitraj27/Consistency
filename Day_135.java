//Concept of JTable class to display data in tabular form
import javax.swing.*;
class Day_135
{
    JFrame f;
    Day_135(){
    
    f=new JFrame();
    String data[][]={{"101","Amit","76000"},{"102","Mohit","1200"},{"103","Raj","7800"}};
    String column[]={"ID","NAME","SALARY"};
    JTable jt=new JTable(data,column);
    jt.setBounds(30,40,200,300);
    JScrollPane sp=new JScrollPane(jt);
    f.add(sp);
    f.setSize(300,400);
    f.setVisible(true);

}
public static void main(String args[])
{
    new Day_135();
}
}