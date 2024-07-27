class Solution {
  public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
    List<int[]>[] adj = new ArrayList[26];
    var minCost = 0L;
    var memo = new HashMap<Pair<Character, Character>, Long>();

    for (var i = 0; i < 26; i++)
      adj[i] = new ArrayList<int[]>();

    for (var i = 0; i < original.length; i++)
      adj[original[i] - 'a'].add(new int[] {changed[i] - 'a', cost[i]});
    
    for (var i = 0; i < source.length(); i++) {
      var key = new Pair(source.charAt(i), target.charAt(i));
      if (memo.containsKey(key)) {
        minCost += memo.get(key);
        continue;
      }
      var converted = false;
      var seen = new boolean[26];
      var charCost = 0L;
      Queue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
      queue.offer(new int[] {source.charAt(i) - 'a', 0});

      while (!queue.isEmpty()) {
        var a = queue.poll();
        var c = a[0];
        var costSoFar = a[1];

        if ((char) (c + 'a') == target.charAt(i)) {
          charCost += costSoFar;
          converted = true;
          break;
        }
        if (seen[c]) continue;
        seen[c] = true;

        for (var nei : adj[c])
          if (!seen[nei[0]])
            queue.offer(new int[] {nei[0], costSoFar + nei[1]});
      }
      if (!converted) return -1;
      minCost += charCost;
      memo.put(key, charCost);
    }
    return minCost;
  }
}