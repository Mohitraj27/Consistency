//Implementation of JSpinner class
import javax.swing.*;
class Day_141
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("Spinner Example");
        SpinnerModel value=new SpinnerNumberModel(5,//intialvalue
                                                0,//min value
                                                10,//max value
                                                1);//step
        JSpinner spinner =new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}