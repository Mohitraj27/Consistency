class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        //Using two pointer approach 
        /*
       1. boatcount variable is taken and intialized with 0
       2. two pointer are intialized with starting index and ending element 
       3. while loop is used and each element from index 0 (i.e first element) is compared 
        with all the elements of the array such that at max two people from array can sit in the 
        boat so that it should not cross the limit value 
        4. after each iteration either combination of two people < =limit if not statisfys 
        then one people alone will be sent from the boat 
        5. after each iteration boatcount is incremented by 1 
        6. after the iteration of all elements is completed then while loop terminated 
        and final value of boat count is returned
        */
        
        int boatcount=0;
        int left_ptr=0,right_ptr=people.length-1;
       Arrays.sort(people);
        while(left_ptr<=right_ptr)
            
        {
            // condition for fitting two people on the same boat
            if(people[right_ptr]+people[left_ptr]<=limit)
            { left_ptr++;
            right_ptr--;
        }
            //else condition for people sent alone from the boat cause it was excedding the limit
        else{
            right_ptr--;
        }
            // counting the number of boats to carry every person
        boatcount++;
        }
    return boatcount;
}}