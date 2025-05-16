class Solution {
    public int reverse(int x) {
    long reversedInteger = 0;
        while(x!=0){
            int unit = x%10;
            reversedInteger = (reversedInteger*10)+unit;
            x/=10;
        }
        if(reversedInteger > Integer.MAX_VALUE || reversedInteger<Integer.MIN_VALUE) 
            return 0;
        return (int)reversedInteger;
    }
}