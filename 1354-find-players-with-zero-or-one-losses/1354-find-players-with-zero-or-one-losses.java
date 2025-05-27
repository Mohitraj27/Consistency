class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> zeroLoses = new ArrayList();
        List<Integer> oneLoses = new ArrayList();
        Map<Integer, Integer> map=new HashMap();
        for(int[] team: matches){
            map.put(team[0], map.getOrDefault(team[0], 0)); 
            map.put(team[1], map.getOrDefault(team[1], 0) + 1);
        }
        for(int player: map.keySet()){
           int losses = map.get(player);
            if (losses == 0) {
                zeroLoses.add(player);
            } else if (losses == 1) {
                oneLoses.add(player);
            }
        }
        Collections.sort(zeroLoses);
        Collections.sort(oneLoses);
        return Arrays.asList(zeroLoses,oneLoses);
    }
}
/**
✅ Approach 
Step 1: Use a HashMap to track incoming edge count (i.e., loss count for each player).

Step 2: Every player that appears as a winner must be added with 0 losses if not already in the map.

Step 3: Every player that appears as a loser increases their loss count.

Step 4: another loop check all the keys which has their track of players 


Let’s fill the table:

1. [1, 3] → Player 1 beat Player 3
Player 1: 0 losses

Player 3: +1 → 1 loss

2. [2, 3] → Player 2 beat Player 3
Player 2: 0 losses

Player 3: +1 → now 2 losses

3. [3, 6] → Player 3 beat Player 6
Player 3: already exists, don’t change loss count

Player 6: +1 → 1 loss

4. [5, 6] → Player 5 beat Player 6
Player 5: 0 losses

Player 6: +1 → now 2 losses

5. [5, 7] → Player 5 beat Player 7
Player 5: already tracked

Player 7: +1 → 1 loss

6. [4, 5] → Player 4 beat Player 5
Player 4: 0 losses

Player 5: +1 → now 1 loss

7. [4, 8] → Player 4 beat Player 8
Player 8: +1 → 1 loss

8. [4, 9] → Player 4 beat Player 9
Player 9: +1 → 1 loss

9. [10, 4] → Player 10 beat Player 4
Player 10: 0 losses

Player 4: +1 → now 1 loss

10. [10, 9] → Player 10 beat Player 9
Player 9: +1 → now 2 losses



| Player | Loss Count |
| ------ | ---------- |
| 1      | 0          |
| 2      | 0          |
| 3      | 2          |
| 4      | 1          |
| 5      | 1          |
| 6      | 2          |
| 7      | 1          |
| 8      | 1          |
| 9      | 2          |
| 10     | 0          |


Players with 0 losses = [1, 2, 10]

Players with 1 loss = [4, 5, 7, 8]



HashMap will be used like this
 Key = player ID
Value = number of times they lost
 */