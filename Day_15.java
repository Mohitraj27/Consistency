//Prime Numbers for 1 to n 
// This code will exclude 1 from the list of Prime.
import java.util.*;
class Day_15
{ 
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int i=0;
            int num=0;
            String primeNos="";
            System.out.println("enter the value of n");
            int n=sc.nextInt();
            sc.close();
           for( i=1;i<=n;i++)
           {
               int counter=0;
               for(int j=i;j>=1;j--)
               {
                   if(i%j==0)
                   {
                       counter+=1;
                   }
                   
               }
               if(counter == 2)
               {
                   primeNos+=i+" ";
               }
           }
           System.out.println("Prime numbers from 1 to "+ n +" are: ");
           System.out.println(primeNos);
        }
}