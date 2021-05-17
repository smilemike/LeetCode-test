
package t100;

import java.lang.reflect.Array;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class s53 {

    //方法1 扫描法
    public int maxSubArray1(int[] nums) {
        if (nums.length==0) return 0;

        int sum = nums[0];
        int max= sum;

        int i=1;
        while (i<=nums.length-1){
            if(sum<0){
                sum = nums[i];
                max = Math.max(nums[i],max);
            } else {
                sum = sum+nums[i];
                max = Math.max(max,sum);
            }
            i++;
        }

        return max;
    }

    /**
     * 动态规划思想
     *  1 如何将规模缩小
     *  2 如何计算小的规模
     *  3 小的规模如何转化为大的规模
     *  （因为计算只能计算小的规模，和由小的集合到大的转化运算，
     *    而人要分析大的规模，小的规模，和由小到大的运算。）
     * 如何状态压缩
     * 算法步骤：
     *      dp[len]记录以i为结尾子数组的最大值。
     *      遍历集合，
     *      dp[i]  = MAX{dp[i-1],0]}+arr[i]
     *      max = MAX{max,dp[i]}
     *
     */
    public int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length-1];
        return 0;
    }
}
