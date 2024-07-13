class Solution {
    public List<Integer> survivedRobotsHealths(int[] pos, int[] hlt, String dir) {
        int n = pos.length;
        List<Integer> ans = new ArrayList<>();
        List<int[]> robots = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            robots.add(new int[]{pos[i], hlt[i], dir.charAt(i), i});
        }
        
        // Sort robots by their positions
        Collections.sort(robots, (a, b) -> Integer.compare(a[0], b[0]));
        
        Stack<int[]> stack = new Stack<>();
        
        for (int[] robot : robots) {
            if (stack.isEmpty() || robot[2] == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && stack.peek()[2] == 'R') {
                    int[] top = stack.pop();
                    if (top[1] > robot[1]) {
                        top[1]--;
                        stack.push(top);
                        robot[1] = -1; // Mark the current robot as destroyed
                        break;
                    } else if (top[1] < robot[1]) {
                        robot[1]--;
                        top[1] = -1; // Mark the robot on the stack as destroyed
                    } else {
                        robot[1] = -1; // Both robots destroy each other
                        break;
                    }
                }
                if (robot[1] > 0) {
                    stack.push(robot);
                }
            }
        }
        
        // Prepare the result list by sorting the remaining robots by their original indices
        List<int[]> remainingRobots = new ArrayList<>(stack);
        remainingRobots.sort(Comparator.comparingInt(a -> a[3]));
        
        for (int[] robot : remainingRobots) {
            if (robot[1] > 0) {
                ans.add(robot[1]);
            }
        }
        
        return ans;
    }
}