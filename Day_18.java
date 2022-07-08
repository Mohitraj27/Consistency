// This program extract the Right and left diagonal of a square matrix and print
// the sum of both . Taking elements of Matrix from user and also rows and column.

import java.util.*;
class Day_18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
         //It's a Square Matrix so rows and colums must be the same.
        int row=sc.nextInt();
        int column=row;
        
        int i,j;
        //rd >> Right diagonal
        //ld >> left diagonal , Extracting both the diagonals seperatorly
        int ld=0,rd=0;
        //Array for Square Matrix
        int A[][]=new int[row][column];
        int k=row-1;
         System.out.println("Enter the elements of the matrix");
        for( i=0;i<row;i++)
        {
           //Taking elements as user input 
            for( j=0;j<column;j++)
            {
                
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Square Matrix is :");
         for( i=0;i<row;i++)
        { //printing the Square Matrix 
           
         for( j=0;j<column;j++)
            {
                
                System.out.print(A[i][j]+" ");
                
            }
            System.out.println();
        }
        for( i=0;i<row;i++)
        { //Taking the sum of left diagonal seperatorly
          ld+=A[i][i];
        }
        for( i=0;i<column;i++)
        { //Taking the sum of right diagonal seperatorly
            
          rd+=A[i][k]; 
          k=k-1;
        }
        System.out.println(ld+rd+" is the sum of right and left diagonal of the Square Matrix");
        
    }
}

//Output 
/*
Enter the no. of rows and columns
3
Enter the elements of the matrix
65
4
2
2
9
1
2
3
4
The Square Matrix is :
65 4 2 
2 9 1 
2 3 4 
91 is the sum of right and left diagonal of the Square Matrix
*/