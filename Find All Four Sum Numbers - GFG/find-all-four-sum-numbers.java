//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // code here
        // same question as four sum
          ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        if (num == null || num.length < 4)
            return res;

        int n = num.length;

        Arrays.sort(num);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && num[j] == num[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = num[i] + num[j] + num[left] + num[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[left]);
                        quad.add(num[right]);
                        res.add(quad);

                        while (left < right && num[left] == quad.get(2))
                            left++;

                        while (left < right && num[right] == quad.get(3))
                            right--;
                    }
                }
            }
        }

        return res;
 
    }
}