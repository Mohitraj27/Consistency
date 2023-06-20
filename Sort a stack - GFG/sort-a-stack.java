//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class GfG{
    /*
     Algotithm Used
    Start with the sort() method.
If the stack st is empty, return the stack as it is already sorted.
Otherwise, pop an element temp from the stack.
Recursively call the sort() method on the remaining stack.
Now, we have a sorted stack.
Call the insertAtCorrectPosition() method to insert the temp element at the correct position in the sorted stack.
Return the sorted stack.
*/
	public Stack<Integer> sort(Stack<Integer> st)
	{
	    /*
	    At first we pop all the elements present in the stack and 
	    
	    */
	    
	    if(st.isEmpty()){
	        return st;
	    }
	    
	    int temp=st.pop();
	    sort(st);
	    
	    // insert that poped element at a certain position
	    insertAtCorrectPosition(st,temp);
	       return st;
 	}
// 	at the insertAtCorrectPosition() method:

// If the stack st is empty or the top element of the stack is less than the temp element, push the temp element onto the stack and return.
// Otherwise, pop an element elem from the stack.
// Recursively call the insertAtCorrectPosition() method on the remaining stack to find the correct position for the temp element.
// Push the elem element back onto the stack.
// The temp element is inserted at the correct position in the stack.
	public static void insertAtCorrectPosition(Stack<Integer> st, int temp){
	    if(st.isEmpty() || st.peek()<temp){
	        st.push(temp);
	        return;
	        
	    }
	    int elem=st.pop();
	    insertAtCorrectPosition(st,temp);
	    st.push(elem);
	}
}