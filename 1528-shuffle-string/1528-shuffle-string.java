class Solution {
    public String restoreString(String s, int[] arr) {
                TreeMap<Integer,Character> t=new TreeMap<Integer,Character>();
        for(int i=0;i<arr.length;i++)
        {
            t.put(arr[i],s.charAt(i));
        }
        String p="";
        for(Map.Entry m:t.entrySet())
        {
          p=p+m.getValue();
        }
        return p;

    }
}