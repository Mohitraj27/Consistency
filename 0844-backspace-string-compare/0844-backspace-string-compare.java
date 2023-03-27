class Solution {
     /*
        Algorithm Used
        1. we'll approach using One string at a time and at last compare both of them and return the final output
        2. Intially create a private method , where take one string as input parameter
        3. Inside this method create one temp string using StringBuilder class 
        4. Declare hashCount variable and intialize it to 0 so that it will count the hash present inside the string
        
        5. now, start iterating through each characters using for loop in backward direction
        6. Inside this for loop extract each character using charAt function and check if it is '#' or not
        7. Increment the hashCount by 1 whenever the hash character is found 
        8. another if condition when hashcount > 0 reduce it & skip the character by one if no backspace found just insert at the begining of the actual string created
        9. return the actualstring , this way repeat the same process for the string t 
        10. Now compare both the strings using .equals() operator
         
        */
        
    public boolean backspaceCompare(String s, String t) {
        
        // Step 10.
        return getActual(s).equals(getActual(t));        
      }

    // Step 2
    private String getActual(String input)
    {
        //Step 3 
        StringBuilder actualString=new StringBuilder();
        
        //Step 4
        int hashCount=0;
        
        //Step 5
        for(int i=input.length()-1;i>=0;i--)
        {
            //Step 6
            if(input.charAt(i)=='#')
                {
                //Step 7
                hashCount++;
            continue;
            }
            //Step 8
            if(hashCount>0)
            { //Step 8
                hashCount--;
            }else
            {// Step 8
                actualString.insert(0,input.charAt(i));
            }
            
               
        }
        //Step 9
        return actualString.toString();
    }


}