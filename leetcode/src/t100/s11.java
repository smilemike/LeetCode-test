package t100;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class s11 {

    public int maxArea(int[] height) {
        int s = 0;
        int pl = 0;
        int pr = height.length-1;
        while (pl<pr){
            int tempS = Math.min(height[pl],height[pr])*(pr-pl);
            s= Math.max(tempS,s);
            if (height[pl]<=height[pr]){
                pl++;
            } else {
                pr--;
            }
        }
        return s;
    }

    public static void main(String[] args) {
    }
}
