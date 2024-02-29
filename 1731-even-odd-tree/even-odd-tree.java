/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> st = new LinkedList<>();
        st.add(root);
        int level=0;
        boolean even=true;

        while(!st.isEmpty()){

           
            
            int size= st.size();
            int prev = level%2==0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

           for(int i=0;i<size;i++){
                TreeNode curr = st.remove();
                
                if(level%2==0 && (curr.val % 2 == 0 || curr.val <= prev))
                    return false;
                if(level%2!=0 && (curr.val % 2 == 1 || curr.val  >= prev))
                    return false;

                prev=curr.val;
                 
             
                if(curr.left!=null) st.add(curr.left);
                if(curr.right!=null) st.add(curr.right);
               

            }
            

            
            level++;

        }
        return true;
    }
}