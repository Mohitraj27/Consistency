class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        long num = 0;
        if(str.isEmpty()) return 0;
        
        int i = 0, sign = 1;
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            sign = str.charAt(i) == '-' ? -1 : 1;
            i++;
        } 

        while(i<str.length() && Character.isDigit(str.charAt(i))){
            num = num*10 + (str.charAt(i) - '0'); 
            if(num*sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign*num);
    }
}