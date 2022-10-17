//program to separate 0s on left side and 1s on right side of an array of 0s and 1s in random order
import java.util.Arrays;
import java.util.Scanner;
public class Day_120 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Input the elements of array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int arr[] = new int[]{ 0, 0, 1, 1, 0, 1, 1, 1,0 };
        int result[];
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        int n = arr.length;
 
        result = separate_0_1(arr, n);
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
      }
    
    static int [] separate_0_1(int arr[], int n)
     {
        int count = 0;   
     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }
 
        for (int i = 0; i < count; i++)
            arr[i] = 0;
 
        for (int i = count; i < n; i++)
            arr[i] = 1;
    
         return arr;
     }       
   }
/*
Enter the size of the array:
5
Input the elements of array:
1
0

1
0
0
Original Array 
[1, 0, 1, 0, 0]
New Array 
[0, 0, 0, 1, 1]
 */