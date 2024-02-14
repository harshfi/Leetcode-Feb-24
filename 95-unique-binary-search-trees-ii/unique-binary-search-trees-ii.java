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
    
    public List<TreeNode> generateTrees(int n) {

        return create(1,n);
        
    }
    public List<TreeNode> create( int s, int e){
        List<TreeNode> list = new ArrayList<>();

        if( s>e) {
            list.add( null); return list;
        }
        if( s==e) {
            TreeNode node = new TreeNode(s);
            list.add(node);
            return list;
        }
       
       for( int i=s;i<=e;i++){

            List<TreeNode> Left = create(s,i-1);
            List<TreeNode> Right = create(i+1,e);

            for( TreeNode l : Left){
                for(TreeNode r : Right){

                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right= r;
                    list.add(node);

                }
            }


       }
        
        
        



        return list;

        
    }
}