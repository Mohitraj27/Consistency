class Solution {
    public boolean buddyStrings(String a, String b) {
        if(a.length() != b.length()) return false;

        if(a.equals(b)){
            HashSet<Character> set=new HashSet();
            for(char c: a.toCharArray()){
                set.add(c);
            }
            return set.size() < b.length();
        }

        List<Integer> diff =new ArrayList();
        for(int i=0;i < a.length();i++){
            if(a.charAt(i) == b.charAt(i)){
                continue;
            }
            diff.add(i);
        }
        return diff.size() == 2 && a.charAt(diff.get(0)) == b.charAt(diff.get(1)) && 
            a.charAt(diff.get(1)) == b.charAt(diff.get(0));

    }
}