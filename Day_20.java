/*
 * Enter your string
Raj 
Original word: Raj 
Reversed word:  jaR

 */
//Code to reverse a string taking String user input
    import java.io.*;
import java.util.Scanner;
 
class Day_20 {
    public static void main (String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str= sc.nextLine();
        String nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println(str); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
 
