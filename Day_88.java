//Java Program to separate the Individual Characters from a String 
import java.util.*;
class Day_88

{  
    public static void main(String[] args) {  
        
        Scanner sc=new Scanner(System.in);
           String string = sc.next();
        //Displays individual characters from given string  
        System.out.println("Individual characters from given string: ");  
  
        //Iterate through the string and display individual character  
        for(int i = 0; i < string.length(); i++){  
            System.out.print(string.charAt(i) + " ");  
        }  
    }  
}  
/*
 Algorithm
STEP 1: START
STEP 2: DEFINE String string = "characters "
STEP 3: PRINT "Individual characters from given string: "
STEP 4: SET i=0. REPEAT STEP 5 to STEP 6 UNTIL i<string.length()
STEP 5: PRINT string.charAt(i)
STEP 6: i=i+1
STEP 7: END
*/
/*
Output :
Characters
Individual characters from given string: 
C h a r a c t e r s  */