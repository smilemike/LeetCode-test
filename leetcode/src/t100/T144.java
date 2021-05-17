package t100;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 * 1 递归方式
 * 2 非递归方式 （递归消除的方式： 1 迭代 2 栈）
 *
 * 栈实现思想：
 *      1 有入才有出，有出不再入。
 *      2 将要访问的入栈，左右节点入栈顺序决定访问顺序。
 *      3 左右节点的顺序其实是左右子树的顺序。
 */
public class T144 {
    //1 递归方式
    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;
        inorder(res,root);
        return res;
    }

    public void inorder(List<Integer> res,TreeNode root){
        if (root==null) return;
        inorder(res,root.left);
        res.add(root.val);
        inorder(res,root.right);
    }*/

    //2 非递归方式 --前序遍历
    //递归消除的方式： 1 迭代 2 栈
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            res.add(temp.val);

            if (temp.right!=null){
                stack.push(temp.right);
            }

            if (temp.left!=null){
                stack.push(temp.left);
            }
        }

        return res;
    }


}
