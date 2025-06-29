class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap();
        int idx = 0;
        for(int i:nums){
            if(map.containsKey(i) && Math.abs(idx - map.get(i))<=k){
                return true;
            }else {
                map.put(i,idx);
            }
            idx++;
        }
        return false;
    }
}