// Leetcode Problem 151. Reverse Words in a String
/*
 Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 
 */
class Day_71 {
    public String reverseWords(String s) {
 /*    One simple approach is a two-pass solution: First pass to split the string by spaces into an
array of words, then second pass to extract the words in reversed order.
We can do better in one-pass. While iterating the string in reverse order, we keep track of
a word’s begin and end position. When we are at the beginning of a word, we append it.
*/
     StringBuilder reverse=new StringBuilder();
        int j=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                j=i;
            }
            else if(i==0||s.charAt(i-1)==' ')
            {
                if(reverse.length()!=0)
                {
                    reverse.append(' ');
                    
                }
                reverse.append(s.substring(i,j));
            }
        }
        return reverse.toString();
        
    }
}

/* Sample Test Cases
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 
 */