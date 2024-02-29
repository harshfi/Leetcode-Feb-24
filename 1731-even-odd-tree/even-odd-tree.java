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

        while(!st.isEmpty()){

            List<Integer> list = new ArrayList<>();
            
            int size= st.size();

           for(int i=0;i<size;i++){
                TreeNode rn = st.remove();
                list.add(rn.val);
                if(level %2==0 && rn.val%2==0) return false;
                if(level %2!=0 && rn.val%2!=0) return false;
                 
             
                if(rn.left!=null) st.add(rn.left);
                if(rn.right!=null) st.add(rn.right);
               

            }
            // System.out.println(list+ " "+ level);

            for(int i=0;i<list.size()-1;i++){

               
                 for(int j=i+1;j<list.size();j++){

                     if(level %2==0 &&  list.get(i)>=list.get(j) ) return false;
                     
                     else if(level %2!=0 && list.get(i)<=list.get(j)) return false;
                   
                 }
            }
            level++;

        }
        return true;
    }
}