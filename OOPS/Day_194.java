// Method Overriding with same method and same signature
class Day_194
{
    public void bark(){
        System.out.println("Object ");
    }
}
class Inheritance extends Day_194
{
    public void Polymorphism()
    {
        System.out.println("sniff");
    }
    //This method bark() of the Dog class
    public void bark(){
        System.out.println("bowl");
    }
}
class OverridingExample
{
public static void main(String args[])
{
    Day_194 dog=new Inheritance();
    //invokes the bark() method of Hound class
    dog.bark();
}

}
