package t100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class s15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length<3) return res;

        //先排序，选 target，再选 Vl+Vr = -target，如果 Vl+Vr偏大，r--,偏小 l++.
        Arrays.sort(nums);
        int base = 0;

        while (base<=nums.length-3){
            if (nums[base]>0) return res;

            if (base>0&&nums[base]==nums[base-1]){
                base++;
                continue;
            }

            int l = base+1;
            int r = nums.length-1;
            int target = -nums[base];
            while (l<=nums.length-2&&r>l){

                if (r<=nums.length-2&&nums[r]==nums[r+1]){
                    r--;
                    continue;
                }

                if (l>=base+2&&nums[l]==nums[l-1]){
                    l++;
                    continue;
                }

                if (nums[l]+nums[r]==target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[base]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    continue;
                }
                if (nums[l]+nums[r]>target){
                    r--;
                    continue;
                }

                if (nums[l]+nums[r]<target){
                    l++;
                    continue;
                }

            }
            base++;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        List list = new s15().threeSum(arr);
        System.out.println(list);
        /*for (int i=0;i<10;i++){
            System.out.println("i------>"+i);
            for (int j=0;j<10;j++){
                System.out.println("===============ij=============");
                System.out.println("i------>"+i);
                System.out.println("j------>"+j);
                System.out.println("============================");
                if (j==3){
                    break;
                }
            }
        }*/
    }
}
