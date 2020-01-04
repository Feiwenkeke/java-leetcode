/**
 * Created with IntelliJ IDEA.
 *
 * @author: feiwe
 * @Date: 2020/1/4
 * @Time: 23:06
 * @Description:
 */

package com.fei.medium._003;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    /**
     * "abcabcbb"
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        //j代表不重复起点
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);

            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);
        }
        return res;
    }

    /**
     * "abcabcbb"
     */
    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        //j代表不重复起点
        for (int i = 0, j = 0; i < s.length();) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                //遇到重复的char不动i，直到j移动到那个重复到char并remove
                set.add(s.charAt(i++));
                res = Math.max(res, set.size());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring2("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring2("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring2("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring2("Abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring2("aab"));
    }
}
