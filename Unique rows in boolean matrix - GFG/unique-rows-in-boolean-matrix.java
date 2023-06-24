//{ Driver Code Starts
import java.lang.Math;
import java.io.*;
import java.util.*;
class UniqueRows{
public static void main(String[] args)throws IOException
 {  
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    String s[]=in.readLine().trim().split(" ");
			int r=Integer.parseInt(s[0]);
			int c=Integer.parseInt(s[1]);
			s=in.readLine().trim().split(" ");
			int ind=0;
			int[][] a=new int [r][c];
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
					a[i][j]=Integer.parseInt(s[ind++]);
			GfG g=new GfG();
			ArrayList<ArrayList<Integer>> arr = g.uniqueRow(a,r,c);
			for(int i = 0;i<arr.size();i++){
			    ArrayList<Integer> demo = arr.get(i);
			    for(int j = 0;j<demo.size();j++){
			        out.print(demo.get(j)+" ");
			    }
			    out.print("$");
			}
			out.println();
		}
		out.close();
 }
}
// } Driver Code Ends


/*Complete the given function*/
class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
    
        Set<Integer> set = new HashSet<Integer>();
        int currValue = 0;
        ArrayList<ArrayList<Integer>> uniqueRow = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<r; i++)
        {
            currValue = valueOfCurrentRow(a[i]);
            if(!set.contains(currValue))
            {
                set.add(currValue);
                ArrayList<Integer> currentRow = new ArrayList<Integer>();
                for(int I : a[i])
                {
                    currentRow.add(I);
                }
                uniqueRow.add(currentRow);
            }
        }
        return uniqueRow;
    }
    
    public static int valueOfCurrentRow(int[] a)
    {
        int value = 0;
        for(int I : a)
        {
            value = value * 10 + I;
        }
        return value;
    }
    
}