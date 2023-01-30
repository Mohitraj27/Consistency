//Constructor chaining using super() keyword
//Below is the child class
class Day_192
{
    String name;
    //This is 1st constructor
    Day_192(){
        this("  ");
        System.out.println("No-argument constructor of"+"base class");
    }
    //this is 2nd constructor
    Day_192(String name)
    {
        this.name=name;
        System.out.println("Calling parameterized constructor "+
        "of base");
    }
}
//below is the parent class or derived class which inherits the properties 
//of child class
    class Derived extends Day_192
{
     //This is third constructor
    Derived(){
        System.out.println("No-argument constructor"
                                 +"of derived");
    }
    //This is the paramterized 4th constructor
    Derived(String name)
    {
        //Invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized"+
        "Constructor of derived");
    }
       public static void main(String args[])
{//calls parameterized constructor 4
    Derived object=new Derived("test");
    
    
    //if we write below line without passing arguments inside 
     // then Calls no-argument constructor
     //Derived obj=new Derived();
}
}       