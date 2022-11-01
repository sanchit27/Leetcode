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
    
    
    public String tree2str(TreeNode root) {
        if(root==null) 
            return "";
        if(root.left==null && root.right==null) 
            return Integer.toString(root.val);
        StringBuffer sb=new StringBuffer(Integer.toString(root.val));
        if( root.right!=null || root.left!=null){
            sb.append("(");
            sb.append(tree2str(root.left));
            sb.append(")");
        }
        if(root.right!=null){
            sb.append("(");
            sb.append(tree2str(root.right));
            sb.append(")");
        }
        return sb.toString();
       
    }
        
        
        
    
}