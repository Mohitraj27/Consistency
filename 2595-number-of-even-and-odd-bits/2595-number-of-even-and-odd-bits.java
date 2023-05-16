class Solution {
    public int[] evenOddBit(int n) {
        int evenCount = 0;
        int oddCount = 0;
        
        for (int evenBitPosition = 0, oddBitPosition = 1; oddBitPosition < 32; evenBitPosition += 2, oddBitPosition += 2) {
            evenCount += 0x1 & (n >> evenBitPosition);
            oddCount += 0x1 & (n >> oddBitPosition);
        }

        return new int[] {evenCount, oddCount};
    }
}