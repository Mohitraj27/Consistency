   //This is the demonstration of Private Access Modifier so it has a compile
   //time error
class Day_184 
{
    private int data=40;
    protected void msg(){
        System.out.println("This is the demonstration of Private Constructor");
        
    }
    public class Simple{
        //If we add static data member here in between then the error is resolved
        public  void main(String args[])
        {
            Day_184 obj=new Day_184();
            //Compile time Error
            System.out.println(obj.data);
            obj.msg();
        }
    }
    /*
     * A class contains private data member and private method. 
     * We are accessing these private 
     * members from outside the class, so there is a compile-time error.
     */
}

    