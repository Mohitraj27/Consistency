//Program to sort a numeric array and a string array.
import java.util.Arrays;


class Day_91
{
    public static void main(String args[])
    {
        
        int[] my_array1={
            1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,
            1457,2456};
            String[] my_array2={
                "Java","Python","PHP","C#"};
                System.out.println("Original Numeric Array:"+Arrays.toString(my_array1));
                Arrays.sort(my_array1);
            System.out.println("Sorted Numeric Array:"+Arrays.toString(my_array1));
                
                 System.out.println("Original String Array:"+Arrays.toString(my_array2));
                Arrays.sort(my_array2);
                 System.out.println("Sorted String array:"+Arrays.toString(my_array2));
            }
        }
        /*
Output         
Original Numeric Array:[1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
Sorted Numeric Array:[1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]
Original Numeric Array:[Java, Python, PHP, C#]
Sorted String array:[C#, Java, PHP, Python]

         */
     
     
