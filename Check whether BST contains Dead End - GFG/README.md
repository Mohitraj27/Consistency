# Check whether BST contains Dead End
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 20px;">Given a&nbsp;<a href="http://quiz.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/">Binary Search Tree</a> that contains positive integer values greater than 0. The task is to complete the function <strong>isDeadEnd</strong> which returns true if&nbsp;the BST contains a dead end else returns false. Here Dead End means, we are not able to insert any element after that node.</span></p>
<p><strong><span style="font-size: 20px;">Example 1:</span></strong></p>
<pre><span style="font-size: 20px;"><strong>Input :</strong>   
&nbsp;              8
             /   \ 
           5      9
         /  \     
        2    7 
       /
      1     
          
<strong>Output :</strong> <br>Yes
<strong>Explanation :</strong> <br>Node "1" is the dead End because after that 
&nbsp;             we cant insert any element.</span></pre>
<p><strong><span style="font-size: 20px;">Example 2:</span></strong><span style="font-size: 20px;"> </span></p>
<pre><span style="font-size: 20px;"><strong>Input :</strong>     
&nbsp;             8
            /   \ 
           7     10
         /      /   \
        2      9     13

<strong>Output :</strong> <br>Yes
<strong>Explanation :</strong> <br>We can't insert any element at 
              node 9.  </span>&nbsp;</pre>
<p><span style="font-size: 20px;"><strong>Your Task:<br></strong><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><span style="color: rgba(0, 0, 0, 0.87); background-color: #ffffff;">You don't have to input or print anything. Complete the function <strong>isDeadEnd</strong></span><span style="box-sizing: inherit; font-weight: bolder; line-height: 1.7em; color: rgba(0, 0, 0, 0.87); background-color: #ffffff;">()&nbsp;</span><span style="color: rgba(0, 0, 0, 0.87); background-color: #ffffff;">which takes the input parameter head and returns a boolean value.</span></span><strong><br></strong></span></p>
<p><span style="font-size: 14pt;"><span style="font-family: arial, helvetica, sans-serif;"><span style="color: rgba(0, 0, 0, 0.87); background-color: #ffffff;"><span style="color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px;"><strong>Expected Time Complexity:</strong> <strong>O(N)</strong> where N is the Number of nodes in a given binary tree.</span><br style="box-sizing: border-box; color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px;"><span style="color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px;"><strong>Expected Space Complexity: O(N)</strong></span></span></span></span></p>
<p><span style="font-size: 20px;"><strong>Constraints:</strong><strong><br></strong></span><span style="font-size: 20px;">1&lt;=T&lt;=100<br>1&lt;=N&lt;=200</span></p>
<p>&nbsp;</p></div>