
/*Output for n is 5
* * * * *
* * * * 
* * * 
* * 
* 
*/
import java.util.*;
class Day_3
{
public static void  main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int num=sc.nextInt();
  for(int i=0;i<=num;i++)
  {
      for(int j=num;j> i;j--)
      {
          System.out.print("*"+" ");
          
      }
      System.out.println();
  }
}}