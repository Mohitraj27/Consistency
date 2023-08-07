class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length;i++)
            st.add(s[i]);
        
        for(int j=0;j<s.length;j++)
         s[j]=st.pop();
        
    }
    
 }