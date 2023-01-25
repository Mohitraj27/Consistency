// class Solution {
//     public List<List<Integer>> generate(int numRows) 
//     {
        
        
//         int number=1;
        
//         int spaces=numRows;
//         for(int i=i=0;i<numRows;i++)
//         {
            
//             //For Blank spaces 
//             for(int s=1;s<=spaces;s++)
//             {
//                 System.out.print(" ");
                
//             }
            
            
//              number=1;
            
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print(number);
//                 number*=(i-j)/(j+1);
//             }

        
//                     spaces--;
//             System.out.println();
   
        
        // class Solution {
    //public List<List> generate(int num) {
        
        
//     ArrayList<List> l1=new ArrayList<List>();
//     int sum=1;
//     for(int i=0;i<numRows;i++){
//     List l2=new ArrayList();
//     l2.add(sum);
//     if (i>0){
//     for(int j=0;j<l1.get(i-1).size()-1;j++){
//     int k=j+1;
//     l2.add(l1.get(i-1).get(j) + l1.get(i-1).get(k));
//     }
//     l2.add(sum);
//     }
//     l1.add(l2);
//     }
//     return l1;
    
//     }
        
//         }

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
    }
}
    
