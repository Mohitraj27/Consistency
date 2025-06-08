class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet();
        for(List<String> path :paths){
            set.add(path.get(0));
        }
        for(List<String> path :paths ){
            if(!set.contains(path.get(1))){
            return path.get(1);
            }

        }
        return null;
    }
}
/**
    Iterate through the list of paths and insert all the first elements of array inside the Set 
    and now check for all the second elements present for each set of list if that particular element doesn't exist then 
    that is the final Destination and return that. Time O(N) Space O(N)

 */