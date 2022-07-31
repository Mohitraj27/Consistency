//Leetcode Problem
//Problem No: 1281. Subtract the Product and Sum of Digits of an Integer

class Day_42 {
    public int subtractProductAndSum(int n) {
        //Product is intialized to 1
        // sum if intialized to 0
        int product=1;
        int sum=0;
       
        
        //For loop for extracting each digits and 
        //calulating its products
        for( int i=n; i!=0 ; i/=10)
        {  
            int digits=i%10;
            product*=digits;
            sum+=digits;
    }
    return product-sum;

    }
}
/*
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
*/