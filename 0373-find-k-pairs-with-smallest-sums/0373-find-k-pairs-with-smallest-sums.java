class Solution {
    public List<List<Integer>> kSmallestPairs
        (int[] nums1, int[] nums2, int k) {
        //create a min Heap
         PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
        
        // 2. Add all the pairs to the min heap
        for (int i = 0; i < nums1.length && i < k; i++) {
            minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }
        
        // 3. Create a result list
        List<List<Integer>> result = new ArrayList<>();
        
        // 4. Iterate until k
        while (k-- > 0 && !minHeap.isEmpty()) {
            // 5. Get the top element from the min heap
            int[] current = minHeap.poll();
            
            // 6. Add the pair to the result list
            result.add(Arrays.asList(current[0], current[1]));
            
            // 7. If the index of the second element is less than the length of the second array
            if (current[2] < nums2.length - 1) {
                // 8. Add the next pair to the min heap
                minHeap.offer(new int[]{current[0], nums2[current[2] + 1], current[2] + 1});
            }
        }
        
        // 9. Return the result list
        return result;
        
        }
}