//Implementation of No-Argument Constructor  
/*
 A Constructor that has no parameter is known as No-argument constructor
 */
import java.util.*;
class Day_188
{
    int num;
    String name;
    
    Day_188(){
       System.out.println("Constructor called");
       
    }
    public static void main(String args[])
    {
        Day_188 object1=new Day_188();
        
        System.out.println(object1.name);
        System.out.println(object1.num);
        
    }
}