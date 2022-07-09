/*
 * 
Enter the no. of rows & columns
3
Enter the elements for your square matrux
2
9
6
4
5
1
2
3
2
Your Square Matrix is: 
2 9 6 
4 5 1 
2 3 2 
Border elements of the matrix
2  9  6  
4    1  
2  3  2  
*/

import java.util.*;
class Day_19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows & columns");
        int row=sc.nextInt();
        int column=row;
        int i,j;
        int A[][]=new int[row][column];
        System.out.println("Enter the elements for your square matrux");
        for( i=0;i<row;i++)
    {
    for( j=0;j<column;j++)
    {
        A[i][j]=sc.nextInt();
    }
    }
    System.out.println("Your Square Matrix is: ");
    for( i=0;i<row;i++)
    {
        for( j=0;j<column;j++)
        {
            System.out.print(A[i][j]+" ");
        }
         System.out.println();
    }
    System.out.println("Border elements of the Square matrix");
    for( i=0;i<row;i++)
    {
        for( j=0;j<column;j++)
        {
            if(i==0)
            {
                System.out.print(A[i][j]+"  ");
            }
            else if(i==row-1)
            {
                System.out.print(A[i][j]+"  ");
            }
             else if(j==0)
            {
                System.out.print(A[i][j]+"  ");
            }
             else if(j==column-1)
            {
                System.out.print(A[i][j]+"  ");
            }
            else 
            System.out.print("  ");
        }
        System.out.println();
    }
}
}