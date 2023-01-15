import java.util.Scanner;
public class Day_207 {
   public static void main(String[] args) { 

     System.out.print("\nFirst ten Lucas a numbers: "); 
     int n = 10;
     int n1 = 2, n2 = 1, n3;
        if (n > 1){
            System.out.println("\n2\n1");
            for(int i = 2; i < n; ++i){
                n3 = n2;
                n2 += n1;
                n1 = n3;
                System.out.println(n2);
            }
        }
        else if (n == 1)
            System.out.println("\n2");

        else
            System.out.println("Input a positive number.");
    }
 }
