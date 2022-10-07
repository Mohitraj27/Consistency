//Program to increase the size of the given arraylist
import java.util.ArrayList;
import java.util.Collections;
class Day_110
{
    public static void main(String args[])
    { 
        ArrayList<String> colorList=new ArrayList<String>(3);
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        
        System.out.println("Orginal Array List: "+colorList);
        //Increase capacity to n+1
        colorList.ensureCapacity(4);
        colorList.add("White");
        colorList.add("Pink");
        colorList.add("Yellow");
        System.out.println("New array list:"+colorList);
    }
}
//Output 
/*
 Orginal Array List: [Red, Green, Blue]
New array list:[Red, Green, Blue, White, Pink, Yellow]

 */