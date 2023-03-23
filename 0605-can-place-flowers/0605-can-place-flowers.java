class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
//         //my incorrect approach
//        int len=flowerbed.length; 
//         for(int i=0;i<len;i++)
//         {
            
//             if(flowerbed[i]!=flowerbed[i+2])
//                 return true;
//             else
//                 return false;
//         }
        
//         return false;
        
        
        //means if no new flowers is to be inserted 
         if(n == 0) 
             return true;
        int i = 0;
        while(i < flowerbed.length)
        {
            if(flowerbed[i] == 0)
            {
                if((i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0))
                {
                    flowerbed[i] = 1;
                    i += 2;
                    n--;
                } else 
                {
                    i++;
                }
            } else {
                i += 2;
            }
            if(n == 0) return true;
        }
        return false;
    }
}