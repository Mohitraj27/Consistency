//Example of Abstract class 
abstract class Vehicle
{
    abstract class Car
    {
        abstract void display();
    }
}
class Honda extends Vehicle
{
    class FourWheller extends Car
    {
        //display method is overridden cause it is same as that in child class
        @Override
        void display(){
            System.out.println("Nested abstract class is invoked");
        }
    }
    
}
public class Day_198{
    public static void main(String args[])
    {
        Vehicle obj=new Honda();
        Honda h=(Honda)obj;
        Honda.FourWheller fw=h.new FourWheller();
        fw.display();
    }
}