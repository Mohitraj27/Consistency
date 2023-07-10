# Normal BST to Balanced BST
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">Given a&nbsp;Binary&nbsp;Search&nbsp;Tree<strong>,</strong> modify the given BST such that it is balanced and has minimum possible height.</span></p>

<p><span style="font-size:20px">Examples :</span></p>

<pre><span style="font-size:18px">Input:
       30
      /
     20
    /
   10
Output:
     20
   /   \
 10     30

Input:
         4
        /
       3
      /
     2
    /
   1
Output:
      3            3           2
    /  \         /  \        /  \
   1    4   OR  2    4  OR  1    3   OR ..
    \          /                   \
     2        1                     4 
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>buildBalancedTree()</strong> which takes root as the input argument and returns the root of tree after converting the given BST&nbsp;into a balanced BST with minimum possible height</span><span style="font-size:20px">.</span><span style="font-size:18px"> The driver code will print the height of the updated tree in output itself. </span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N)<br>
Here N denotes total number of nodes in given BST.</span></p>

<p><br>
<span style="font-size:20px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=200</span></p>
</div>