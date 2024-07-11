class Solution {
   
    public String reverseParentheses(String s) {
        Stack<Character> charStack = new Stack<>();
        
        s = "((" + s + "))";
        
        String result = "";
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (charStack.empty() || s.charAt(i) != ')') {
                charStack.push(s.charAt(i));
            } else {
                StringBuilder temp = new StringBuilder();
                
                while (charStack.peek() != '(') {
                    temp.append(charStack.pop());
                }
                
                charStack.pop();
                
                result = temp.toString();
                
                for (int j = 0; j < temp.length(); j++) {
                    charStack.push(temp.charAt(j));
                }
            }
        }
        return result;
    }
}