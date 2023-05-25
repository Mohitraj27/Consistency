class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        
        int n=a.length;
        int m=b.length;
         // taking a new array and merging both the arrays in result
        int result[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
            result[i]=a[i];
        }
    for(int j=0;j<m;j++)
        {
            result[n+j]=b[j];
        }
        // sorting the merged array
        Arrays.sort(result);
        // now if the length of the merged array is even 
        // divide the length of the array by 2 and return (intial and final value of array)/2
        if((n+m)%2==0)
        {
            int z=(n+m)/2;
            int s=result[z];
            
            int e=result[z-1];
            
            double ans=(e+s)/2.0;
            return ans;
            
        }
        //If length if array is odd then divide the length of array by 2 
        // round that value and return arr[value]
        else{
            int z=Math.round((n+m)/2);
            return result[z];
        }
    
       
    }
}