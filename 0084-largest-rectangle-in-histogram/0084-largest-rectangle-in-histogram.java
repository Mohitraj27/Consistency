    /*
    algo used by aditya verma 
    i.e first taking nearest smaller to left and nearest smaller to right seperately function
    then calculate the width of rectangle = right[i]-left[i]-1; 
    now area=arr[i]*width; // currentelement*width
    check that max area updating the max area and return 
    
    1. Intialize variables and data structure
    2. calculate left indices and right indices using stack based approach (i.e nearest smaller left and nearest smaller right)
    3. Iterating through the array to calculate max area a
      -> calculate width and area of rectangle for each box 
      -> update the max area if neccessary
     4. return the max area as result
     time - O(N) space O(N)
     
 */
    

class Solution {
    // calculating max rectangle i.e main fucntion
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;

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
// applying code for Nearest Smaller to left
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

// applying code for Nearest Smaller to right
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
   
        
        
        
