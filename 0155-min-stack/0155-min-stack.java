class MinStack {
   /*Simply taking two stacks one with all Data and minData
	Initally intialized with starting element and comparing the top of mid data with cuurent element
	curr_element is the element which is to be pushed

	if (curr_element > top.middata )
	then don't push that element into mid data 
	else if(curr_element<top.middata)
	then push that element into mid data
     time -O(1) space -O(n)
    
    */
    
    
    
    
    
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> Minstack=new Stack<>();
    public void push(int val) {
     //- This Condition will make sure that on top Min Value will be present
        if (!Minstack.isEmpty() && val<=Minstack.peek()){
            Minstack.push(val);
        }
        else if(Minstack.isEmpty()){
            Minstack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (Objects.equals(stack.peek(), Minstack.peek())){
            Minstack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return Minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */