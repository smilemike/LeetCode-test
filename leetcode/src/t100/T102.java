package t100;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 */
public class T102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null) return res;
        queue.add(root);
        while (queue.size()>0){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size>0){
                TreeNode temp = queue.remove();
                list.add(temp.val);

                if (temp.left!=null) {
                    queue.add(temp.left);
                }

                if (temp.right!=null) {
                    queue.add(temp.right);
                }
                size--;
            }
            res.add(list);
        }
        return res;
    }
}
