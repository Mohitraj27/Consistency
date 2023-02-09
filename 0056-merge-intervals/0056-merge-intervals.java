class Solution {
    public int[][] merge(int[][] intervals) {
   
        //First sorted the array list using first pair of x element
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        //a new st stack is created
        Stack<Integer> st=new Stack<Integer>();
        
        st.push(intervals[0][0]);
        st.push(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            int x=st.pop();
            if(intervals[i][0]<=x){
                st.push(Math.max(intervals[i][1],x));
            }
            else{
                st.push(x);
                st.push(intervals[i][0]);
                st.push(intervals[i][1]);
            }
        }
        int[][] ans=new int[st.size()/2][2];
        for(int i=st.size()/2-1;i>=0;i--){
            for(int j=1;j>=0;j--){
                ans[i][j]=st.pop();
            }
        }
        return ans;
    }
} 
