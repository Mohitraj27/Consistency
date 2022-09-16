//Java Program to divide a string in 'N' equal parts.
import java.util.*; 
class Day_89 
 {  
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
          String str = sc.next();  
  
        //Stores the length of the string  
        int len = str.length();  
        //n determines the variable that divide the string in 'n' equal parts  
        int n = 3;  
        int temp = 0, chars = len/n;  
        //Stores the array of string  
        String[] equalStr = new String [n];  
        //Check whether a string can be divided into n equal parts  
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                equalStr[temp] = part;  
                temp++;  
            }  
            System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  
        }  
}  
//Output
/*
 3 equal parts of given string are 
aaaa
bbbb
cccc
mohitraj
Sorry this string cannot be divided into 3 equal parts.

 */