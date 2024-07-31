class Solution {
    private int solveMemo(int[][] books, int idx, int width, int height, int[][] dp, int shelfWidth) {
        // Base case
        if (idx == books.length) {
            return height;
        }

        // Step-2
        if (dp[idx][width] != 0) {
            return dp[idx][width];
        }

        // step-3
        int take = Integer.MAX_VALUE;
        int nontake = Integer.MAX_VALUE;

        if (width + books[idx][0] <= shelfWidth) {
            take = solveMemo(books, idx + 1, width + books[idx][0],
                    Math.max(height, books[idx][1]), dp, shelfWidth);
        }

        nontake = height + solveMemo(books, idx + 1, books[idx][0],
                books[idx][1], dp, shelfWidth);

        return dp[idx][width] = Math.min(take, nontake);
    }

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[][] dp = new int[books.length + 1][shelfWidth + 1];
        
        return solveMemo(books, 0, 0, 0, dp, shelfWidth);
    }
}
