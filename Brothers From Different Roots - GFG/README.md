# Brothers From Different Roots
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two BSTs containing N<strong>1</strong>&nbsp;and N<strong>2</strong>&nbsp;distinct nodes respectively and given a value&nbsp;<strong>x</strong>. Your task is to complete the function <strong>countPairs()</strong>, that returns the&nbsp;count of all pairs from both the BSTs whose sum is equal to&nbsp;<strong>x</strong>.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
<strong>BST1:</strong>
&nbsp;      5
     /   \
&nbsp;   3     7
&nbsp;  / \   / \
  2   4 6   8

<strong>BST2:</strong>
&nbsp;      10
&nbsp;    /    \
&nbsp;   6      15
&nbsp;  / \    /  \
&nbsp; 3   8  11   18

<strong>x</strong> = 16
<strong>Output:
</strong>3
<strong>Explanation:
</strong>The pairs are: <strong>(5, 11), (6, 10)</strong> and <strong>(8, 8)</strong></span><span style="font-size:18px">
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
BST1:</strong>
  1
   \
    3
   /
  2
<strong>BST2:
&nbsp;   </strong>3
&nbsp;  / \
&nbsp; 2   4
 /     
1

<strong>x</strong> = 4
<strong>Output:
</strong>3
<strong>Explanation:</strong>
The pairs are: <strong>(2, 2), (3, 1)</strong> and <strong>(1, 3)</strong>
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>countPairs()</strong>, which takes 2 BST's as parameter in form of <strong>root1</strong> and <strong>root2</strong> and the integer <strong>x</strong>,&nbsp;that returns the&nbsp;count of all pairs from both the BSTs whose sum is equal to&nbsp;<strong>x</strong>.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ Number of nodes ≤ 10<sup>5</sup><br>
1 ≤ Data of a node ≤ 10<sup>6</sup></span></p>
</div>