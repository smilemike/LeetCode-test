package t100;

/**
 * 75. 颜色分类
 * 0、 1 和 2 分别表示红色、白色和蓝色。
 * 思想: 三指针法.
 * 循环的条件,左指针小于右指针.
 * 滑动窗口,双指针,快慢指针的边界条件有的是 left<right
 *
 * 方法:
 *  p0 白色右边界 0,p2蓝色左边界,用来表示数组的位置,只要0和2数组位置正确,剩下就是1的位置.
 */
public class T75 {
    public void sortColors(int[] nums) {
        if (nums.length<=1) return;

        int p0= 0;
        int p2 = nums.length-1;

        int curr = 0;
        while (curr<=p2){
            if (nums[curr]==0){
                swap(p0,curr,nums);
                p0++;
                curr++;
            } else if (nums[curr]==2){
                swap(p2,curr,nums);
                p2--;
            } else {
                curr++;
            }
        }
    }

    void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
