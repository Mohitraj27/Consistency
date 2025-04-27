class Solution {
    public int distributeCandies(int[] candyType) {
        
        Set<Integer> uniquetypesOfCandides=new HashSet<>();
        for(int i : candyType){
            uniquetypesOfCandides.add(i);
        }
        int maxCandiesAllowed = candyType.length/2;


        return Math.min(uniquetypesOfCandides.size(), maxCandiesAllowed);
    }
}