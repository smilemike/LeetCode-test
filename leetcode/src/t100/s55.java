
package t100;

/**
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个下标。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class s55 {
    /**
     *  贪心：可以得到近似最优解
     *  dp： 可以得到最优解
     */
    public boolean canJump(int[] nums) {
        if (nums.length<=1) return true;
        int farthest = 0;//可以跳到的最远下标
        int i=0;
        while (i<nums.length){
            farthest = Math.max(farthest,i+nums[i]);
            if (farthest>=nums.length-1) return true;
            i++;
            if (i>farthest){
                return false;
            }
        }
        return false;
    }
}
