/*This pattern is for seven number of rows
 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
       
 */
import java.util.*;
class Day_4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         //r is for user input number of rows
        int r=sc.nextInt();
        
         for(int i=0;i<=7;i++)
        {   //k loop is for creating space after changing the line
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<r-1-i;j++)
            {
                System.out.print("*"+" ");
                
            }
            System.out.println();
        }
    }
}