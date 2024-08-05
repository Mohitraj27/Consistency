class Solution {
    public String kthDistinct(String[] arr, int k) {
         Map<String, Integer> d = new HashMap<>();
        for (String x : arr) {
            d.put(x, d.getOrDefault(x, 0) + 1);
        }
        
        String ans = "";
        int count = 0;
        for (String x : arr) {
            if (d.get(x) == 1) {
                ans = x;
                count++;
            }
            
            if (count == k) {
                return ans;
            }
        }
        return "";
    }
}