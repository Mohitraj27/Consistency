class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int children = 0,cookie=0;
        while(children < g.length && cookie < s.length){
            if(s[cookie]>=g[children]){
                children++;
            }
            cookie++;
        }
        return children;
    }
}

/**
Using Two pointer Appraoch 
Sort Both the Arrays First 
Intialized two pointer to oth index to both of the arrays 
and iterating through each of the loop one by one by checking the condition that elemetn of cookies array should be greater than equals to childrens atray if so then incremtn the children counter by 1 else check for another elemt of the cookies arrays , and when the while loop terminates then return the children counter
Time - O(NLogN) Space - O(1)
 */