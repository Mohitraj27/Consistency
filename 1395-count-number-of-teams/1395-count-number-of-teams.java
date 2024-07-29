class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;

        int nge[]=new int[n];
        int nse[]=new int[n];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(rating[i]<rating[j]){
                    nge[i]++;
                }
                else nse[i]++;
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(rating[i]<rating[j]){
                    cnt+=nge[j];
                }
                else cnt+=nse[j];
            }
        }
        return cnt;
    }
}