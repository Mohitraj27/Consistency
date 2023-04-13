class Solution {
    public boolean validMountainArray(int[] arr) {
        
        
        
       // Using two pointer approach
        
        /* Algorithm Used
        1. Intially check for the length of the array <3 return false
        2. Here we've taken two pointer L-> left_ptr and R -> right_ptr
        3. while loop for left ptr start from left side (starting element) is 
        less than its next element i.r incresing order increment L ptr by 1
        4. Similarly , for right ptr which starts from last element and the elemnt
        will be in decreasing order i.e last elemnt < last second element , then 
        decrement pointer  by 1
        5. Also if the left pounter reches to last element by incresing that means 
        its a stricly incresing so return false same condition for strictly decreasing
        
        
        */
    if(arr.length<3)
        return false;
        
        int n=arr.length;
        int L=0,R=n-1;
        while(L<n-1)
        {
            if(arr[L]<arr[L+1])
                L++;
            else break;
        }
    if(L==n-1)
        return false;
        
        while(R>0)
        {
            if(arr[R]<arr[R-1])
                R--;
            else break;
        }
        if(R==0)
            return false;
        return L==R;
    
    
    }
}