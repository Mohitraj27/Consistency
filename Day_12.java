//Plaindrome Number
// E.g 121 is a plaindrome no. cause on reversing the digits it will be same as the orginial value.
import java.util.*;
class Day_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>9)
       {  //for conversion of integer to String 
           String string_num=String.valueOf(num);
           //reversing the input string
        String str=new StringBuilder(string_num).reverse().toString();
        //checking for plaindrome
        if(str.equals(string_num))
        {
            System.out.println(num+"Is a Plaindrome Number");
            
        }
        else{
        System.out.println(num+"Is not a Plaindrome Number");
    }
} else{
    System.out.println("Enter a two digit number");
}
}
}
