/*
 Program to read a string and if a substring of length two appears at
 both its beginning and end, return a string without the substring at
 the beginning otherwise, return the original string unchanged.
 */
import java.util.*;
class Day_118
{
    public String withoutMatch(String str)
    {
        int len=str.length();
        //if the length of the string is 2 return null
        if(len ==2)
        return "" ;
        if(len<2)
        return str;
        else 
        { //checking for the first 2 and last 2 position of the string
            if(str.substring(0,2).equals(str.substring(len-2,len)))
            return str.substring(2,len);
            else return str;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Day_118 ob=new Day_118();
        System.out.println("Input your string:");
        String str=sc.next();
        System.out.println("Orginal String:"+str);
        System.out.println("The new String :"+ ob.withoutMatch(str));
    }
}
//Output
/*
 Input your string:
educated
Orginal String:educated
The new String :ucated
Input your string:
MohitRaj
Orginal String:MohitRaj
The new String :MohitRaj
 */