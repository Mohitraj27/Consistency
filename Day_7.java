/* This pattern is when num is 10
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * 
* * * * * * * * 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
import java.util.*;
class Day_7
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i =0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*"+" ");
                
            }
            System.out.println();
        }
        for(int i=0;i<num;i++)
        {
            for(int k=num;k>i;k--)
            {
                System.out.print("*"+ " ");
            }
        System.out.println();
        }
    }
}