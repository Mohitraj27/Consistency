//leetcode Problem 168 Excel Sheet Column Title
//Given an integer columnNumber,
// return its corresponding column title as it appears in an Excel sheet.
class Day_77 {
    public String convertToTitle(int columnNumber) {
     StringBuilder title = new StringBuilder();
        
        while(columnNumber >= 1){
            title = title.append((char)(((columnNumber - 1) % 26) + 65));
            columnNumber = (columnNumber-1) / 26;
        }
        return title.reverse().toString();   
    }
}
/*
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
*/