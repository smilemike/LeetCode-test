package t100;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class s3 {

    public int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0) return 0;
        int max = 0;

        int pL= 0;
        int pR = 0;

        Map<Character,Integer> cache = new HashMap<>();
        int len = s.length();
        while (pR<len){
            Integer index = cache.get(s.charAt(pR));
            if (index!=null&&index.intValue()>=pL){
                pL = index.intValue()+1;
            } else {
                max = Math.max((pR-pL+1),max);
            }
            cache.put(s.charAt(pR),pR);
            pR++;
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(new s3().lengthOfLongestSubstring(s));
    }
}
