package t100;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * 思想: 回溯
 *
 * List list = new ArrayList<>() 表示空数组 []
 */
public class T78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        System.out.println(res);
        if (nums.length==0){
            return res;
        }
        backTrace(res,nums,0,new ArrayList<>());
        return res;
    }

    void backTrace(List<List<Integer>> res,int[] nums,int start,List<Integer> trace ){
        res.add(new ArrayList<>(trace));
        if (trace.size()==nums.length){
            return;
        }

        for (int i=start;i<nums.length;i++){
            trace.add(nums[i]);
            backTrace(res,nums,i+1,trace);
            trace.remove(trace.size()-1);
        }
    }
}
