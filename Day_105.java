//to update specific array element by given element in a ArrayList
import java.util.*;
class Day_105
{
    public static void main(String args[])
    {
         List<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        //Print the list
        System.out.println(list_Strings);
        //Update the third element with "Yellow"
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your Color want to insert in above arrayList");
        String insert=sc.nextLine();
        System.out.println("Input your position in arrayList where you want to insert");
        int position=sc.nextInt();
        
        list_Strings.set(position,insert);
        //Print the list again
        sc.close();
        System.out.println("Updated Array List "+list_Strings);
        
    }
}
//Output 
/*
Input your Color want to insert in above arrayList
Grey
Input your position in arrayList where you want to insert
3
Updated Array List [Red, Green, Orange, Grey, Black]
 */