//Implementation of Hierarchical Inheritance
class Day_202
{
    void eat()
    {
        System.out.println("eating..");
        
    }}
    class Dog extends Day_202
    {
        void bark(){
            System.out.println("barking..");
            
        }
        
    }
    class Cat extends Day_202{
        void meow(){
            System.out.println("meowing..");
        }
    }
    class Animal{
        
        public static void main(String args[])
        {
            Cat c= new Cat();
            c.meow();
            c.eat();
        }
    }
