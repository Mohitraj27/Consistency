class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        
 List list=new ArrayList<>();
 int greatest=candies[0];
 for(int i=0;i<candies.length;i++){
 if(candies[i]>greatest){
 greatest=candies[i];
 }
 }

     for(int i=0;i<candies.length;i++){
         int temp=candies[i]+extraCandies;
         if(temp>=greatest){
             list.add(true);
         }
         else{
         list.add(false);
       }
   }
    return list;
    }
}
