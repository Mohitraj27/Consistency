
// Program to take user input size  of arraylist,print the arraylist and test the arraylist is empty or not .
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Day_111
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrayList:");
        int n=sc.nextInt();
        ArrayList<Integer> c1=new ArrayList<Integer>(n);
        for(int i=0;i<=n;i++)
        
          c1.add(i);
        
        System.out.println("Intial List :"+c1);
        System.out.println("Checking the above array list is empty or not! :"+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array List after remove all elements "+c1);
        
        System.out.println("Checking the above array list is empty or not! :"+c1.isEmpty());
    }
}
/* Output
 Enter the size of the arrayList:
10
Intial List :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Checking the above array list is empty or not! :false
Array List after remove all elements []
Checking the above array list is empty or not! :true

 */