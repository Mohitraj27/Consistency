//calculate the largest gap between sorted elements of an array of integers.
/*
Sample Data:
{1, 2 ,9, 0, 4, 6} -> 3
{23, -2, 45, 38, 12, 4, 6} -> 15
*/
import java.util.*;
class Day_117
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Original Array:" +Arrays.toString(nums));
        int result=test(nums);
        System.out.println("Largest gap b/w sorted elements of the array:"+result);
    }
     public static int test(int []nums)
     {
         Arrays.sort(nums);
         //System.out.println("Sorted Array:"+nums);
         int largest_gap=0;
         for(int i=0;i<nums.length-1;i++)
         {
             largest_gap=Math.max(nums[i+1]-nums[i],largest_gap);
         }
         return largest_gap;
     }

}