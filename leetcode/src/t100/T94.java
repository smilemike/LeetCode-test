package t100;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * 1 递归方式
 * 2 非递归方式 （递归消除的方式： 1 迭代 2 栈）
 *
 * 栈实现思想：
 *      1 有入才有出，有出不再入。
 *      2 将要访问的入栈，左右节点入栈顺序决定访问顺序。
 *      3 左右节点的顺序其实是左右子树的顺序。
 *
 *  入栈的顺序决定了树节点的层级关系和先后顺序。
 *  左 根 右入栈的顺序决定了，左子树 中 右子树的遍历顺序。
 *
 *  -----------------------1 先序遍历-----------------------
 *  一个节点也代表一个棵树。当前节点，左右子树的顺序由当前节点决定，因为遍历和压栈的顺序
 *  是为了和父级的子树的关系。
 *  1 如何入栈
 *  2 如何出栈
 *
 *  --------------------总结--------------------
 *  栈里的决定树的层次关系
 *  未入栈的节点考虑成单个树的关系
 */
public class T94 {
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

    /**
     * 前序遍历
     *
     */
    public void inorder1(TreeNode root) {
        /* System.out.println(root.val);
        inorder(root.left);
        inorder(root.right);*/
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(root.val);
            stack.push(temp.right);
            stack.push(temp.left);
        }
    }

    /**
     * 中序遍历
     *
     */
    public void inorder2(TreeNode root) {
        /*inorder2(root.left);
        System.out.println(root.val);
        inorder2(root.right);*/

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty()){
            while (temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            TreeNode treeNode = stack.pop();
            System.out.println(treeNode.val);

            if (treeNode.right!=null){
                temp = treeNode.right;
            }
        }
    }

    /**
     * 后序遍历
     *
     */
    public void inorder3(TreeNode root) {
        inorder3(root.left);
        inorder3(root.right);
        System.out.println(root.val);

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty()){
            while (temp!=null){
                stack.push(temp);
                temp = temp.left;
            }

            TreeNode treeNode = stack.pop();
            System.out.println(treeNode.val);

            if (treeNode.right!=null){
                temp = treeNode.right;
            }
        }
    }


}
