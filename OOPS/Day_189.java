//This is implementation of Parameterized Constructor
import java.util.*;
//This extends keyword in Java specfies a
// relationship between parent and child
//class
//this is the child class
class Day_189 extends Parameterized_constructor
{
    String name;
    int id;
    //parameterized constructor with arguments
    Day_189(String name , int id){
        //this keyword inside contructor is used to invoke current objects
        this.name=name;
        this.id=id;
    }
    
}
//this is parent class
class Parameterized_constructor
{
    public static void main(String args[])
    {
        //Creating a object for child class inside parent class 
        Day_189 object=new Day_189(" Mohit ",69);
        //calling objects of child class 
        System.out.print(" Mohit Raj "+object.name+" and Id "+object.id);
    }
}