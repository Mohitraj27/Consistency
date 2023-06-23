class Solution {
    public boolean isPalindrome(int x) {
           String num=Integer.toString(x);
        int start=0,end=num.length()-1;
        while(start<=end){
            if(num.charAt(start)==num.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;     
    }
}