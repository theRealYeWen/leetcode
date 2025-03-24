package org.problems.hash;

import java.util.HashMap;

public class Problem04_Leetcode001 {
    /*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    示例:

    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
    */

    public int[] twoSum(int[] nums, int target) {
        // 用于输出结果下标
        int[] res = new int[2];
        if (nums == null || nums.length < 2) {
            return res;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[0] = map.get(temp);
                res[1] = i;
                break;
            }
            // 如果没找到就把访问过的元素和下标放进map中，看之后有没有机会匹配到
            map.put(nums[i], i);
        }
        return res;
    }
}
