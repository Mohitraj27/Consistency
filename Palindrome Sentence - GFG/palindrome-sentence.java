//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
       public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String str = sc.nextLine();
            Solution ob = new Solution();
            if(ob.sentencePalindrome(str))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    } 
} 
// } Driver Code Ends


class Solution { 

    static boolean sentencePalindrome(String s) { 
        // code here
          //length of the string is assigned to j
        //i is intialized to 0
        int i=0,j=s.length()-1;
        while(i<j)
        {
            //while loop to checking the each character of a string is alphanumeric or not //this while loop breaks as it founds any leeter of digit strating iteratinnfrom 1st index
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
 i++;
 //this while loop breaks as it founds any leeter of digit strating iteratinnfrom last index
                   
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
                        j--;
            //Checking the character of string and convert it to lowercase 
                        if(Character.toLowerCase(s.charAt(i)) !=Character.toLowerCase(s.charAt(j)))
                            {
                                return false;
                            }
                            i++;j--;
                        
                      
        }
        
          return true; 

    }
}