class Solution {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dis = new int[n][n];
        for (int[] row : dis) {
            Arrays.fill(row, 10001);
        }
        for (int[] edge : edges) {
            dis[edge[0]][edge[1]] = dis[edge[1]][edge[0]] = edge[2];
        }

        // diagonal as zero
        for (int i = 0; i < n; i++) {
            dis[i][i] = 0;
        }

        // FLOYYD ALGO
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                }
            }
        }

        int res = 0, smallest = n;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (dis[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }

            if (cnt <= smallest) {
                res = i;
                smallest = cnt;
            }
        }
        return res;
    }
}