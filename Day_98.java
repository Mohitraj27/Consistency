//program to find the common elements between two arrays of integers.
import java.util.*;
class Day_98
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of n");
        int n=sc.nextInt();
        int array1[]=new int[n];
        int array2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array1[i]=sc.nextInt();
            array2[i]=sc.nextInt();
        }
        System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(array1[i]==(array2[j]))
               {
                   System.out.println("Common element is:"+(array1[i]));
               }
           }
       }
    }
}

//OutPut
/*
 Enter the size of n
4
1
6
5
9
4
3
2
1
Array1 : [1, 5, 4, 2]
Array2 : [6, 9, 3, 1]
Common element is:1

 */