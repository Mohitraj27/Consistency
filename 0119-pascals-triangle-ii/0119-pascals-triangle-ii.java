class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        long cnt=1;
        res.add((int)cnt);
        for(int i=1;i<=rowIndex;i++)
        {
            cnt=cnt*(rowIndex+1-i)/i;
            res.add((int)cnt);
        }
        return res;
    }
}