// Rotating the square matrix Anticlockwise by 90 degree. taking size and elements of a matrix as user input.
//This algo works for rotating the  square matrix anticlockwise by 90 degree for size 4
		 /* [0][0] -> [0][3]
		  * [0][3] ->  [3][3]
		  * [3][3] -> [3][0]
		  * [3][0] -> [0][0]
		*/
import java.util.*;
class Day_23
{
  public static void main(String arr[])
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


	         // Rotate a Matrix anti clock wise 90 degree
		for (int x = 0; x < m / 2; x++) 
		{
 
	 		for (int y = x; y < m - x - 1; y++) 
			{
			int temp = matrix[x][y];
			matrix[x][y] = matrix[y][m - 1 - x];
			matrix[y][m - 1 - x]= matrix[m - 1 - x][m - 1 - y];
			matrix[m - 1 - x][m - 1 - y] = matrix[m - 1 - y][x];
			matrix[m - 1 - y][x] = temp;
			}
		}
		
		
		//This algo works for rotating the  square matrix anticlockwise by 90 degree for size 4
		 /* [0][0] -> [0][3]
		  * [0][3] ->  [3][3]
		  * [3][3] -> [3][0]
		  * [3][0] -> [0][0]
		*/
	System.out.println("Matrix After Rotate 90 Degree:");
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

/*Output
 * Enter the Value of M : 
4
Enter 16 Elements for Matrix : 
2
6
32
2
2
6
4
5
5
1
3
5
1
9
8
4
Original Matrix :
2  6  32  2  
2  6  4  5  
5  1  3  5  
1  9  8  4  
Matrix After Rotate 90 Degree:
2  5  5  4  
32  4  3  8  
6  6  1  9  
2  2  5  1  
 */