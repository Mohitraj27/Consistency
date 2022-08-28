/* Leetcode Problem 125
 A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */

class Day_70 {
    public boolean isPalindrome(String s) {
   //length of the string is assigned to j
        //i is intialized to 0
        int i=0,j=s.length()-1;
        while(i<j)
        {
            //while loop to checking the each character of a string is alphanumeric or not from front side
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
                  i++;
                 
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
                        j--;
            //Checking the character of string and convert it to lowercase from back end side
                        if(Character.toLowerCase(s.charAt(i)) !=Character.toLowerCase(s.charAt(j)))
                            {
                                return false;
                            }
                            i++;j--;
                        
                      
        }
        
          return true;
    }
}

/*
 Differnt Approach
 for(int i=0;i<s.length();i++)
        if(s[i]>=65 && s[i]<=90)
            s[i]+=32;
  
    int i=0,j=s.length()-1;
    while(i<j) {
        int a=s[i];
        int b=s[j];
        if(a<48 || (a>57&&a<97) || a>122) {
            i++;
            continue;
        }
        if(b<48 || (b>57&&b<97) || b>122) {
            j--;
            continue;
        }
        if(s[i]!=s[j])
            return false;
        i++; j--;  
    }
    return true;
 */
/*
 * Sample Test Cases
 Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */