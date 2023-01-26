

import java.util.*;
class pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int numRows=sc.nextInt();
        int number=1;
        sc.close();
        int spaces=numRows;
        for(int i=0;i<numRows;i++)
        {
            
            //For Blank spaces 
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
                
            }
          number=1;
            
            for(int j=0;j<=i;j++)
            {
                System.out.print(number + "  ");
                number*=(i-j)/(j+1);
            }

        
                    spaces--;
            System.out.println();
   
        }
    }
}
