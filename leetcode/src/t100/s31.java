package t100;


import java.util.Arrays;

/**
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class s31 {

    public void nextPermutation(int[] nums) {

        //找出非递归的索引i
        int i=nums.length-1;
        while (i>=0){
            if (i==nums.length-1) {
                i--;
                continue;
            }
            if (nums[i]<nums[i+1]){
                break;
            } else {
                i--;
            }
        }

        if (i<nums.length-1&&i>=0){
            int j = nums.length-1;
            while (j>i){
                if (nums[j]>nums[i]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    break;
                } else {
                    j--;
                }
            }
        }
        Arrays.sort(nums,i+1,nums.length);
    }


    public static void main(String[] args) {

    }
}
