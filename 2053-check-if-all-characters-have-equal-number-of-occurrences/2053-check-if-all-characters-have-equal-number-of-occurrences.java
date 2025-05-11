class Solution {
    public boolean areOccurrencesEqual(String str) {
        HashMap<Character,Integer> freqMap =new HashMap<>();
        for(char ch:str.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        
        int expectedFreq = -1;
        for(int freq:freqMap.values()){
            if(expectedFreq == -1){
                expectedFreq = freq;
            }else if(freq != expectedFreq){
                return false;
            }
        }
        return true;
    }
}