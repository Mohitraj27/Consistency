//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    // int minEle;
    // Stack<Integer> s;
    
    Stack<Integer> allData=new Stack<>();
    Stack<Integer> minData=new Stack<>();
    
//     // Constructor    
//     GfG()
// 	{
      
// 	}
	/*Simply taking two stacks one with all Data and minData
	Initally intialized with starting element and comparing the top of mid data with cuurent element
	curr_element is the element which is to be pushed
	if (curr_element > top.middata )
	then don't push that element into mid data 
	else if(curr_element<top.middata)
	then push that element into mid data
	
	*/int size(){
	    return allData.size();
	}
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(size()==0){
	    return -1;
	}
	else{
	    return minData.peek();
	}
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(size()==0){
            return -1;
        }
        else{
            int x=allData.pop();
            if(x==minData.peek()){
                minData.pop();
            }return x;
        }
	// Your code here	
    }
      int top(){
          if(size()==0){
              return -1;
          }
          else {
              return allData.peek();
          }
      }
    /*push element x into the stack*/
    void push(int x)
    {
        allData.push(x);
        if(minData.size()==0||x<=minData.peek()){
            minData.push(x);
        }
	// Your code here	
    }	
}

