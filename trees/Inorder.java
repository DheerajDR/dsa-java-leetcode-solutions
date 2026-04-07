
class Inorder {
    class TreeNode{int val;TreeNode left,right;}
    public java.util.List<Integer> inorderTraversal(TreeNode root){
        java.util.List<Integer> res=new java.util.ArrayList<>();
        helper(root,res);
        return res;
    }
    void helper(TreeNode root, java.util.List<Integer> res){
        if(root==null) return;
        helper(root.left,res);
        res.add(root.val);
        helper(root.right,res);
    }
}
