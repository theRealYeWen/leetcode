package org.problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_08_Leetcode007 {


  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    if (nums.length < 3) {
      return new ArrayList<>();
    }

    Arrays.sort(nums);

    // 思路是先固定一个数，然后再找另外两个数
    for (int i = 0; i < nums.length - 2; i++) {
      // 如果排序后的值相同则跳过，避免重复计算
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
          result.add(List.of(nums[i], nums[left], nums[right]));
        }

        if (sum > 0) {
          right--; // 和太大，减小right
        } else {
          left++; // 和太大，增加left
        }
      }

    }
    return result;
  }
}
