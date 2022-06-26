   /*  This O/p is when n is 5
      *  
   *   *  
  *   *   *  
 *   *   *   *  
 *   *   *   *   *  

    */ 
import java.util.*;
class Day_6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //n is for the number of rows
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i-1;j++)
            { //j loop is for printing the number of spaces
                System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--)
            {
                System.out.print(" * " + " ");
            }
            System.out.println();
        }
    }
}