package t100;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 */
public class T104 {

    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (queue.size()>0){
            int size = queue.size();
            while (size>0){
                TreeNode temp = queue.remove();
                if (temp.left!=null){
                    queue.add(temp.left);
                }

                if (temp.left!=null){
                    queue.add(temp.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
    }
}
