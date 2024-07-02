class Solution {
    public int maximumCount(int[] num) {
        int neg=0,pos=0;
        for(int i=0;i<num.length;i++){
            if(num[i]<0)
                neg++;
             if(num[i]>0)
                pos++;
            
        }
       return Math.max(neg,pos);
        
    }
}