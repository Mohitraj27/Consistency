class Solution {
    
 
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // Aditya Verma Stack Playlist Video No 8
        // in this function we'r compressing or converting 2D matrix into 1D matrix
        // so that we can easily calculate using MAH(Max Area of Histogram)
        // and for MAH we need to calculate Nearest Smaller to LEft and Nearest SMaller to right , after that width is calculated and multipted by area of each reactangel and max area is returned
        int[] heights = new int[n];
           
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
               heights[j] = matrix[i][j] == '1' ? heights[j] + 1: 0;
            }
            ans = Math.max(ans,largestRectangleArea(heights, n));
        }
        
        return ans;}
    // Calculating MAH (MAX Area of Historgram) needed to solve this problem statement
      private int largestRectangleArea(int[] arr,int n) {
       // int n = arr.length;

        int[] left = leftIndex(arr, n);
        int[] right = rightIndex(arr, n);

        int area = 0;
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    
// applying code for Nearest Smaller to left needed to calculate MAH
    private int[] leftIndex(int[] arr, int n) {
        int[] left = new int[n];
        Stack<Integer> stack = new Stack<>();
        int pseudoIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                left[i] = pseudoIndex;
            } else if (arr[stack.peek()] < arr[i]) {
                left[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    left[i] = pseudoIndex;
                } else {
                    left[i] = stack.peek();
                }
            }
            stack.push(i);
        }

        return left;
    }

// applying code for Nearest Smaller to right needed to calculate MAH
    private int[] rightIndex(int[] arr, int n) {
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        int pseudoIndex = n;

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                right[i] = pseudoIndex;
            } else if (arr[stack.peek()] < arr[i]) {
                right[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    right[i] = pseudoIndex;
                } else {
                    right[i] = stack.peek();
                }
            }
            stack.push(i);
        }

        return right;
    }

}
    
