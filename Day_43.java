//Leetcode Problem 1779
// Find Nearest Point That Has the Same X or Y Coordinate
/*
You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).*/
class Day_43
{
    public int nearestValidPoint(int x,int y,int [][]points)
    { 
        //minDis is the variable instialized to Max Distance intially
        //indx is the counter variable instialized to -1
        int indx=-1,minDis=Integer.MAX_VALUE;
        //for loop till the length of the array points
        for(int i=0;i<points.length;i++)
        {
            int arr[]=points[i];
            
            if(arr[0]==x||arr[1]==y)
            { //Here we have used Math.abs to get +ve digits
                //Calulating the Manthan distance and storing it in dis variable
                int dis=Math.abs(x-arr[0])+Math.abs(y-arr[1]);
                
                if(dis<minDis){
                    minDis=dis;
                    indx=i;
                }
            }
        }
        return indx;
    }
}
// Sample Test Cases
/*
 * Input: x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
Output: 2
Explanation: Of all the points, only [3,1], [2,4] and [4,4] are valid. Of the valid points, 
[2,4] and [4,4] have the smallest Manhattan distance from your current location, with a distance of 1. [2,4] has the smallest index, so return 2.

 */