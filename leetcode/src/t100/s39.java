package t100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定一个无重复元素的数组 candidates 和一个目标数 target ，
//找出 candidates 中所有可以使数字和为 target 的组合。

/**
 * DFS搜索+ 回溯 + 减枝
 * 方法：
 * 1 先理清思路
 * 2 申明一些结果变量和中间变量
 * 3 对变量的意义作用 理解说明
 * 4 边界：
 *      1 进入边界和退出边界的变量值
 * 5 退出条件
 */
public class s39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length==0) return res;
        Arrays.sort(candidates);
        this.dfs(candidates,target,res,new ArrayList<Integer>(),0);
        return res;
    }

    /**
     * candidates 候选的数组
     * target 目标数
     * res 结果list
     * tempList 临时list
     * sum 临时总和
     *
     * return 退出整个函数，break 结束循环。
     * i>=j： 第一次包含i，第二层从i+1开始，下一层为Arr[i+1]开始搜索和回溯。
     *
     * DFS 需要内层考虑外层的条件
     */
    void dfs(int[] candidates,int target,List<List<Integer>> res,List<Integer> track,int j){
        if (target==0){
            res.add(new ArrayList<>(track));
            return;
        }

        if (target<0){
            return;
        }

        int i = j;
        while (i<=candidates.length-1){
            System.out.println(track);
            if ((target-candidates[i])<0){
                //减枝
                break;
            }
            track.add(candidates[i]);
            target = target-candidates[i];
            dfs(candidates,target,res,track,i);
            target = target+candidates[i];
            track.remove(track.size()-1);
            i++;
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        System.out.println(new s39().combinationSum(candidates,8));
    }

}
