/* This O/p is when num is 10
1
12
123
1234
12345
123456
1234567
12345678
*/
import java.util.*;
class Day_9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}