class Solution {
    public String reverseWords(String s) {
        
       /* One simple approach is a two-pass solution: First pass to split the string by spaces into an
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