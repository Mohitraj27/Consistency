/* 
 This O/p is when n is 5
     *
    * *
   * * *
  * * * *
*/ 
import java.util.*;
class Day_6
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(" "+"*");
        }
        System.out.println();
    }
}}