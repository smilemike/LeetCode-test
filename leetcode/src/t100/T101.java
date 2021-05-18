package t100;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//101. 对称二叉树
//给定一个二叉树，检查它是否是镜像对称的。
//判断当前层是否对称，如果对称才遍历下一层放入队列，并从队列读取比较是否对称。
public class T101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        if (queue.size()>0){

            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size>0){
                TreeNode temp = queue.remove();
                if (temp!=null){
                    list.add(temp.val);
                    queue.add(temp.left);
                    queue.add(temp.right);
                } else {
                    list.add(null);
                }
                size--;
            }
            System.out.println(list);
            //双指针判断对称性
            int i = 0;
            int j = list.size()-1;
            while (i<j){
                boolean res = false;
                if (list.get(i)==null&&list.get(j)==null) {
                    res = true;
                } else if (list.get(i)!=null&&list.get(j)!=null&&list.get(i)==list.get(j)){
                    res = true;
                } else {
                    res = false;
                }

                if (res==true){
                    i++;
                    j--;
                    continue;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
