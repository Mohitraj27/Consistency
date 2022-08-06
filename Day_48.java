/* Problem 58 Length of Last Word
 * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

class Day_48 {
    
    public int lengthOfLastWord(String s) {
        
        int len=0;
        //This .tim() will remove spaces from the string
        String x=s.trim();
        for(int i=0;i<x.length();i++){
            //it will check each charcater has space then len
            // will be intialized to 0 else it will increment the value of len
            if(x.charAt(i)==' ')
                len=0;
            else
                len++;
        }
        return len;
    }
}

 
/*Sample Test Cases
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */