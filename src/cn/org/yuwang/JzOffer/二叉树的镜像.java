package cn.org.yuwang.JzOffer;

/**
 * Created by m1500 on 2016/8/3.
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if(root==null)
            return ;
        Swap(root);
    }
    public void Swap(TreeNode root){
        if(root==null)
            return ;
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        Swap(root.left);
        Swap(root.right);
    }
}
