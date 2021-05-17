package t100;

import java.util.Arrays;

//34. 在排序数组中查找元素的第一个和最后一个位置
public class s34 {
    //思路 二分查找，找到一个mid，左边[0,mid]找left，右边 (mid,len-1]
    //根据l,mid,r值判断返回值
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        int tMid = -1;
        int tL = -1;
        int tR = -1;

        int i=0;
        int j=nums.length-1;
        while (i<=j){
            int mid = i + (j-i)/2;
            if (nums[mid]==target) {
                tMid = mid;
                break;
            }

            if (nums[mid]<target){
                i=mid+1;
                continue;
            }

            if (nums[mid]>target){
                j=mid-1;
                continue;
            }
        }

        if (tMid<0) return res;

        //[0,tmid]找l ，(timid,len-1] 找r
        //找l
        i=0;
        j=tMid-1;
        int minMidLeft = tMid;
        while (i<=j){
            int mid = i + (j-i)/2;
            if (nums[mid]==target) {
                minMidLeft = Math.min(minMidLeft,mid);
                j = mid-1;
                continue;
            }

            if (nums[mid]<target){
                i=mid+1;
                continue;
            }

            if (nums[mid]>target){
                j=mid-1;
                continue;
            }
        }

        i=tMid+1;
        j=nums.length-1;
        int minMid2 = tMid;
        while (i<=j){
            int mid = i + (j-i)/2;
            if (nums[mid]==target) {
                minMid2 = Math.max(minMid2,mid);
                i = mid+1;
                continue;
            }

            if (nums[mid]<target){
                i=mid+1;
                continue;
            }

            if (nums[mid]>target){
                j=mid-1;
                continue;
            }
        }

        if (minMidLeft>=0){
            tL = Math.min(minMidLeft,tMid);
        } else {
            tL = tMid;
        }

        if (minMid2>=0){
            tR = Math.max(minMid2,tMid);
        } else {
            tR = tMid;
        }

        res[0] = tL;
        res[1] = tR;

        return res;
    }


    public static void main(String[] args) {

    }
}
