//Program to make new string from two given string in such a way 
//that each character of two string will come respectively.
import java.util.Scanner;
import java.util.*;
class Day_121
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter 2 strings:");
        String str1=sc.next();
        String str2=sc.next();
        sc.close();
        Day_121 ob=new Day_121();
        System.out.println("The given strings are: "+str1+" and "+str2);
          System.out.println("The new String after mixing are :"+ob.Str_Mix(str1,str2));
    }
    public String Str_Mix(String str1, String str2)
    {
        int len1=str1.length();
        int len2=str2.length();
        int max_len=Math.max(len1,len2);
        String new_string = "";
        for(int i=0;i<max_len;i++)
        {
            if(i<=len1-1)
            new_string+=str1.substring(i,i+1);
            if(i<=len2-2)
            new_string+=str2.substring(i,i+1);
        }
        return new_string;
        
    }
}
//Output
/*
 Enter 2 strings:
welcome
w3resource
The given strings are: welcome and w3resource
The new String is :wwe3lrceosmoeurc
Enter 2 strings:
Mohit_is_in_CSE
Mohit_is_in_BIT
The given strings are: Mohit_is_in_CSE and Mohit_is_in_BIT
The new String after mixing are :MMoohhiitt__iiss__iinn__CBSIE

 */