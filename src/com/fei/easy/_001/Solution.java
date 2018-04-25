package com.fei.easy._001;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: fei
 * @Date: 2018/4/24
 * @Time: 16:17
 * @Description:
 */
public class Solution {
    public int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
