
class Solution {
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {

        if(root==null){
            return 0;
        }
        sumr(root,null,null);
        return sum;
       
    }
    
    public void sumr(TreeNode root,TreeNode p,TreeNode gp){
        
        if(root==null){
           return;
        }
        if(gp!=null&&gp.val%2==0){
            sum +=root.val;
        }
        
        if(root.left!=null)
            sumr(root.left,root,p);
        
        if(root.right!=null)
            sumr(root.right,root,p);
}
}
