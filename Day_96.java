// Program to find maximum product of two integers in a given array of integers
import java.util.*;
class Day_96
{
	public static void find_max_product(int[] nums)
	{
		int max_pair_product = Integer.MIN_VALUE;
		    int max_i = -1, max_j = -1;

		for (int i = 0; i < nums.length - 1; i++)
	              	{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (max_pair_product < nums[i] * nums[j])
				{
					max_pair_product = nums[i] * nums[j];
					max_i = i;
					max_j = j;
				}
			}
		}
                System.out.print("Pair is (" + nums[max_i] + ", " + nums[max_j] + "), Maximum Product: " + (nums[max_i]*nums[max_j]));
	}
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the elements of array");
	    int n=sc.nextInt();
	    int nums[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
 	        nums[i]=sc.nextInt();
            }
	    /*int[] nums = { 2, 3, 5, 7, -7, 5, 8, -5 };
		 * 
		 */
		System.out.println("\nOriginal array: "+Arrays.toString(nums));
		find_max_product(nums);
	}
}
// Output of the Program 
/*
Enter the elements of array
5
2
3
-4
-9
8
Original array: [2, 3, -4, -9, 8]
Pair is (-4, -9), Maximum Product: 36
 */
