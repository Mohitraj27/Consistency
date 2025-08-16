// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int N) {
        // code here
           ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        
        for(int i=2;i<=N;i++)
        {
            int carry=0;
            
            for(int j=0;j<list.size();j++)
            {
                int val=list.get(j)*i+carry;
                list.set(j,val%10);
                carry=val/10;
            }
            
            while(carry!=0)
            {
                list.add(carry%10);
                carry=carry/10;
            }
        }
        
       Collections.reverse(list);
        
        return list;
    }
}