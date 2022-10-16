//smallest gap between the sorted elements of the array 
import java.util.Scanner;
public class Day_119
{
  public static void main(String[] args)
  {
    int[] list = {3, 1, 6, 12, 7};
    int minResult = minGap(list);
    System.out.println("Smallest gap b/w sorted elements of the array" +minResult);

}
  public static int minGap(int[] list){

    if (list.length < 2){
        return 0;
    }
    int min = list[1] - list[0];
    for (int i = 0; i < list.length-1; i++){
        if (min > list[i+1] - list[i]){
             min = list[i+1] - list[i];
        } 
    }
    return min;
}}
/* Output 
 Smallest gap b/w sorted elements of the array -5
 */