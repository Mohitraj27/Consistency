//Program to find the missing string from two specified strings
 import java.util.*;
 public class Day_100 {
 public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Input  two strings:");
   String s1 = sc.nextLine();
   String s2 = sc.nextLine();
   System.out.println("Missing string: " + Arrays.toString(missing_Words(s1, s2)));
  }
  public static String[] missing_Words(String t, String s)
 { // breaking the entire string in different parts 
  String[] s1 = t.split(" ");
  String[] s2 = s.split(" ");
  //extracting the length of two strings and storing in sz
  int sz = s1.length - s2.length;
  //declaring the String array  for two different string size
  String[] missing_str = new String[sz];
  int c = 0;
  //for loop for String s1
  for (int i = 0; i < s1.length; i++) {
      
   int flag = 0;
   //for loop for String s2
   for (int j = 0; j < s2.length; j++) {
       //checking the two string using .equals()
    if (s1[i].equals(s2[j]))
     flag = 1;
   }
   if (flag == 0) {
    missing_str[c++] = s1[i];
   }
   }
   return missing_str;
 }
}
/*
 Output
 Input  two strings:
Mohit Raj
Mohit
Missing string: [Raj]
 */
