//Swap two nos without using temp variable.

import java.util.*;
class Day_16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to be swapped");
        int first=sc.nextInt();
        int second=sc.nextInt();
        sc.close();
        //Swaping using XOR Operator
        first=second^first;
        second=second^first;
        first=first^second;
        System.out.println("Numbers after swapping:"+first +" "+ second);
    }
}