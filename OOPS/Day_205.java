//Illustration of Dynamic Binding 
class Day_205
{
    void eat(){
        System.out.println("animal is eating..");
    }
    
}
class dog extends Day_205{
    void eat(){
        System.out.println("dog is eating..");
        
    }
    public static void main(String args[])
    {
        Day_205 a=new dog();
        a.eat();
    }
}