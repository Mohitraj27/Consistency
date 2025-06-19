class Solution 
{
    public boolean isValid(String s) 
    {
        // O(n) time | O(n) space
        if(s == null || s.length() == 0)    return true;
        if(s.length() % 2 != 0) return false;
        
        Stack<Character> myStack = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{')
                myStack.push(ch);
            else
            {
                if(ch == ')' && (myStack.isEmpty() || myStack.peek() != '('))
                    return false;
                if(ch == ']' && (myStack.isEmpty() || myStack.peek() != '['))
                    return false;
                if(ch == '}' && (myStack.isEmpty() || myStack.peek() != '{'))
                    return false;
                
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
}