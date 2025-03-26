package org.problems.slidingwindow;

import java.util.HashMap;

public class Problem03_Leetcode560 {

  /*
  和为 K 的子数组
  给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
  子数组是数组中元素的连续非空序列。
  示例 1：
  输入：nums = [1,1,1], k = 2
  输出：2

  示例 2：
  输入：nums = [1,2,3], k = 3
  输出：2
  */

  // 对于这种子数组的和一般会优先考虑前缀和的方法，这道题可以结合前缀和+HashMap
  // 求子数组的和可以用 前缀和-前面某段的前缀和 = 区间和/子数组的和
  public static int subarraySum(int[] nums, int k) {
    // 首先定义一个HashMap, 用于存储和为k的子数组的个数
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    int preSum = 0;
    int count = 0;
    //    然后遍历数组，计算前缀和
    for (int num : nums) {
      preSum += num;

      if (map.containsKey(preSum - k)) {
        count += map.get(preSum - k);
      }
      // 更新前缀和更新次数
      map.put(preSum, map.getOrDefault(preSum, 0) + 1);
    }
    return count;
  }
}
