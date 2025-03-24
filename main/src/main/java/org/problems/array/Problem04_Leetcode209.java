package org.problems.array;

public class Problem04_Leetcode209 {

  /*
  给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。
  如果不存在符合条件的子数组，返回 0。
  示例：
  输入：s = 7, nums = [2,3,1,2,4,3]
  输出：2
  解释：子数组 [4,3] 是该条件下的长度最小的子数组。
  提示：   1 <= target <= 10^9
          1 <= nums.length <= 10^5
          1 <= nums[i] <= 10^5
   */
  // 暴力解法就是两个for循环遍历出所有情况，找出最小的长度
  // 滑动窗口法其实也是优化暴力解法，将两个for循环做的事情用一个for循环做完
  public static int minSubArrayLen(int target, int[] nums) {
    int sum;
    int minSubLength = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum >= target) {
          minSubLength = Math.min(minSubLength, j - i + 1);
        }
      }
    }
    return minSubLength == Integer.MAX_VALUE ? 0 : minSubLength;
  }
}


