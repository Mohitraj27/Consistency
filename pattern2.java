lass Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList();// agar koi row na ho to empty set return kr do
        List<List<Integer>> res = new ArrayList();

        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList();
            for(int j = 0 ; j < i ; j++){
                if(j == 0  || j== i-1){
                    row.add(1);//pehlaa aur last hamesa 1 hoga
                }else{
                    row.add(res.get(i-2).get(j) + res.get(i-2).get(j-1));
                    //to get middle values we use previous middle values
                    //
                }       
            }
            res.add(row);
        }
        return res;
    }
}