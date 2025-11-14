class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int n=points.length;
        int result=0;

        for(int i=0;i<n;i++){
             Map<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];

                // Use squared distance (no sqrt needed)
                int dist = dx * dx + dy * dy;

                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }

            // For each distance group of size m:
            // number of permutations = m * (m - 1)
            for (int count : map.values()) {
                result += count * (count - 1);
            }
        }
        return result;
    }
}