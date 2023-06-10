class Solution {
    public int trap(int[] height) {
        // concept of aditya verma
        int maxLeft=0;
        int maxRight=0;
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        for(int i=0;i<height.length;i++){
            maxLeft=height[i]>maxLeft?height[i]:maxLeft;
            left[i]=maxLeft;
        }
        for(int i=height.length-1;i>-1;i--){
            maxRight=height[i]>maxRight?height[i]:maxRight;
            right[i]=maxRight;
        }
        int finalWaterTapped=0;
        for(int i=0;i<height.length;i++){
            if(left[i]!=0 && right[i]!=0){
                finalWaterTapped+=Math.min(left[i],right[i])-height[i];
            }
        }
        return finalWaterTapped;
    }
}