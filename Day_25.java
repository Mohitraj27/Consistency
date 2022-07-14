//This Program is for Clockwise rotation of a square matrix by 90 degree.
//This algo works for rotating the  square matrix anticlockwise by 90 degree for size 4
         /* [0][3] -> [0][0]
          * [0][0] ->  [3][0]
          * [3][3] -> [0][3]
          * [3][3] -> [0][3]
        */

import java.util.*;
class Day_25
{
    public static void main(String args[])
    {
         int matrix[][]=new int[10][10];
        int m,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of M : ");
        m=sc.nextInt();
        System.out.println("Enter "+(m*m)+" Elements for Matrix : ");
        for(a=0;a<m;a++)
        {
            for(b=0;b<m;b++)
            {
                matrix[a][b]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix :");
        for(a=0;a<m;a++)
        {
            for(b=0;b<m;b++)
            {
                System.out.print(matrix[a][b]+"  ");
            }
            System.out.println();
                }


             // Rotate a Matrix  clock wise 90 degree
        for (int x = 0; x < m / 2; x++) 
        {
 
             for (int y = x; y < m - x - 1; y++) 
            {
            int temp = matrix[x][y];
            matrix[x][y] = matrix[m-1-y][x];
            matrix[m-1-y][x]= matrix[m - 1 - x][m - 1 - y];
            matrix[m - 1 - x][m - 1 - y] = matrix[ y][m-1-x];
            matrix[y][m-1-x] = temp;
            }
        }
        
        
        //This algo works for rotating the  square matrix anticlockwise by 90 degree for size 4
         /* [0][3] -> [0][0]
          * [0][0] ->  [3][0]
          * [3][3] -> [0][3]
          * [3][3] -> [0][3]
        */
    System.out.println("Matrix After clockwise Rotate 90 Degree:");
        for(a=0;a<m;a++)
        {
            for(b=0;b<m;b++)
            {
                System.out.print(matrix[a][b]+"  ");
            }
            System.out.println();
        }
    
    
    }
}