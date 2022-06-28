/*This O/P is when num is 10
          
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
class Day_8
{
    public static void main(String args[])
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
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int x=0;x<num;x++)
        {
            for(int y=0;y<x;y++)
            {
                System.out.print(" ");
            }
            for(int z=num;z>x;z--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}