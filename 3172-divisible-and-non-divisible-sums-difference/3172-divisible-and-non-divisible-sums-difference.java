class Solution {
    public int differenceOfSums(int n, int m) {
        // Time - O(1) Space O(1)
      int totalSum = n * (n + 1) / 2;

        int k = n / m; // number of terms divisible by m
        int divisibleSum = m * k * (k + 1) / 2;

        return totalSum - 2 * divisibleSum;
    }
}


 