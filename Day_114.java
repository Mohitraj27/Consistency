//Program to print the LEADERS in the array
//Note: An element is leader if it is greater than all the elements to its right side.

import java.util.Scanner;
import java.util.Arrays;
class Day_114
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int j;
        int arr[]=new int[n];
        //Taking elements as user input
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int size=arr.length;
         for(int i=0;i<n;i++)
         {
             
             for( j= i+1;j<n;j++)
             { //comparing each element with its next element
                 
                 if(arr[i]<=arr[j])
                 break;
                 
             }
             if(j==n)
             System.out.print(arr[i]+ " ");
         }
    }
}
//
/* Output of the Program
 Enter the size of the array: 
6
10
9
14
23
15
0
23 15 0
 */