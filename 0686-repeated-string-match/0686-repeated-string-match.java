class Solution {
    public int repeatedStringMatch(String a, String b) {
        String x = "";
        int count = 0;
        while (x.length() < b.length()) {
            x += a;
            count++;
        }
        if (x.indexOf(b) >= 0)
            return count;
        if ((x + a).indexOf(b) >= 0) {
            return ++count;
        }
        return -1;
    }
}
