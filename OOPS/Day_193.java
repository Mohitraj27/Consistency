// constructor Using Init block
//If there are more than one blocks, they are executed in the order
// in which they are defined within the same class
class Day_193
{
    {
        System.out.println("init block");
        
    }
    //No-arg constructor
    Day_193(){
        System.out.println("default");
        
    }
    //Constructor with one argument
    Day_193(int x){
        System.out.println(x);
    }
    public static void main(String args[])
    {
        //Object creation by calling no-argument constructor
        new Day_193();
        //Object creation by calling parameterized constructor with 
        // one parameter
        new Day_193(10);
    }
}