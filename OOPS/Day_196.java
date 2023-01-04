//Example of Destructor 
//Java Finalize() Method
class Day_196
{
    public static void main(String args[])
    {
        Day_196 ob=new Day_196();
        ob.finalize();
        ob=null;
        System.gc();
        System.out.println("Inside the main() method");
    }
    protected void finalize(){
        System.out.println("Object is destroyed by the Garbage Collector");
    }
}