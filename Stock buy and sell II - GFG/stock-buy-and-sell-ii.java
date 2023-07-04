//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



// class Solution {
//     public static int stockBuyAndSell(int n, int[] prices) {
//         // code here
//     }
// }
        class Solution {
    
    public static int stockBuyAndSell(int n, int[] prices) {
      //initialise bought and sell as variables to store buy and sell price
        int bought = prices[0],sellprice = prices[0];
        //int n = prices.length;
        int profit = 0;
        for(int i = 0; i< n ; i++){
            //if element has higher value than sell price the update sell price
            if(prices[i] > sellprice){
                sellprice = prices[i];
                if(i == n-1) profit += sellprice - bought;
            }
            //if element has lower or equal to value than sellprice increase the profit and update the buy and sell price 
            else if(prices[i] < sellprice || i == n-1){
                profit+= sellprice - bought;
                bought = prices[i];
                sellprice = prices[i];
            };
            //if element is the last element then we add the latest sold price to the sum profit and return it
        }
        return profit;
        
        
    }
}
