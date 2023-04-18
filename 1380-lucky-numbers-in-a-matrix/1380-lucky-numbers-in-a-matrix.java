class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
             List<Integer> result = new ArrayList<Integer>();
//rows[] and col[] arrays are used to save row_min and col_max values
int rows[] = new int[matrix.length];
int columns[] = new int[matrix[0].length];

//to find row_min values and adding into row[]
for (int i = 0; i < matrix.length; i++) {
    int min = 999999999; 
    for (int j = 0; j < matrix[i].length; j++) {
         min = Math.min(matrix[i][j], min);
    }
    rows[i] = min;
}

//To find col_max values and adding into col[]
 for(int i=0; i < matrix[0].length;i++){
     int max = 0;
    for (int j = 0; j < matrix.length; j++) {
         max = Math.max(matrix[j][i], max);
    }
    columns[i] = max;
}

//to store result value because return type is arraylist
 
 //To compare arrays(row[] and col[]
for(int i=0;i<matrix.length;i++){
    for(int j=0; j < matrix[0].length;j++){
        if(rows[i]==columns[j]){
          result.add(rows[i]);
          }
    }
}
return result;
    }
}