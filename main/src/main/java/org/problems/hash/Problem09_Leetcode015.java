package org.problems.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem09_Leetcode015 {
  /*
  给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
  同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
  注意：答案中不可以包含重复的三元组。
  示例 1：
  输入：nums = [-1,0,1,2,-1,-4]
  输出：[[-1,-1,2],[-1,0,1]]
  解释：
  nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
  nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
  nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
  不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
  注意，输出的顺序和三元组的顺序并不重要。

  示例 2：
  输入：nums = [0,1,1]
  输出：[]
  解释：唯一可能的三元组和不为 0 。

  示例 3：
  输入：nums = [0,0,0]
  输出：[[0,0,0]]
  解释：唯一可能的三元组和为 0 。
  */

  // 思路就是想着先排序
  // 然后先固定一个数,对于每个固定的 nums[i]，在其右侧数组中使用两个指针（left 和 right）寻找满足 nums[i] + nums[left] + nums[right] == 0 的组合。
  // 为了避免重复答案，需要在固定第一个数字时跳过相同的数字，同时在左右指针移动时也跳过重复的数字。
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> lists = new ArrayList<>();

    if (nums == null || nums.length < 3) {
      return new ArrayList<>();
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] > 0) {
        break;
      }
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {

        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
          lists.add(List.of(nums[i], nums[left], nums[right]));
        }
        if (sum > 0) {
          right--;
        }
        if (sum < 0) {
          left++;
        }
      }
    }
    return lists;
  }
}
