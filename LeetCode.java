import java.util.HashMap;
import java.util.Map;

public class LeetCode {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }
    public static int lengthOfLongestSubstring(String s) {
        //滑动窗口

        Map<Character,Integer> map= new HashMap<>();
        //初始化map
        char[] ss=s.toCharArray();

        int res = 0;//结果
        for(int left = 0, right = 0; right < s.length(); right++) {//每一轮右端点都扩一个。
            //right指向的元素，也是当前要考虑的元素
            map.put(ss[right], map.getOrDefault(ss[right], 0)+1);
            while(map.get(ss[right])>1) {//map中有ch，则缩短左边界，同时从set集合出元素
                map.put(ss[left], map.get(ss[left])-1);
                left++;
            }

            res = Math.max(res, right - left + 1);//计算当前不重复子串的长度。
        }
        return res;
    }

}