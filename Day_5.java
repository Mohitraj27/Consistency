/* This output is when r is 5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
*/

import java.util.*;
class Day_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //r is the number of rows
        int r=sc.nextInt();
        for(int i=0;i<=r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
                
            }
            System.out.println();
        }
    }
}