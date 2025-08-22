class Solution {
public int[][] merge(int[][] intervals) {
   
        //First sorted the array list using first pair of x element
        
    /*
    below is the lamba expression that compares two intervals a and b by their 
    first elements (a[0],b[0]) using comapare() methof to perform the comparison.
    this methd returns a -ve value if(a[0]<b[0]) 
    */
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
 
    // Create a new ArrayList 
    ArrayList<int[]> mergedIntervals = new ArrayList<>();

    mergedIntervals.add(intervals[0]);

    for (int i = 1; i < intervals.length; i++) {
        int[] currentInterval = intervals[i];
        int[] previousInterval = mergedIntervals.get(mergedIntervals.size() - 1);

        if (currentInterval[0] <= previousInterval[1]) {
            // Merge the intervals
            previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
        } else {
            // Add the current interval to the merged intervals list
            mergedIntervals.add(currentInterval);
        }
    }

    // Convert the ArrayList to a 2D array
    int[][] mergedArray = new int[mergedIntervals.size()][2];
    for (int i = 0; i < mergedIntervals.size(); i++) {
        mergedArray[i] = mergedIntervals.get(i);
    }

    return mergedArray;
}

    
}
