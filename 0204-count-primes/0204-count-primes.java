class Solution {
    public int countPrimes(int num) {
        
//         // My Brute force approach
//      int count=0;
//     for(int i=1;i<num;i++)
        
//     { //Calling isPrime funcion and checking number of prime numbers
//         if(checkPrime(i))
//         {    count++;
//         }
//         }
//         return count;
//     }
    
    
//     public static boolean  checkPrime(int num)
//     {
//         //this function check the Prime numbers present
//         if(num<=1)
//         {    return false;
//         }
//         for(int i=2;i*i<=num;i++)
//         {
//             if(num%i==0)
//           return false;
            
        
//         }
//         return true;
//     }
        
        //Optimized solution
                boolean[] notPrime = new boolean[num];
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < num; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }

    
}