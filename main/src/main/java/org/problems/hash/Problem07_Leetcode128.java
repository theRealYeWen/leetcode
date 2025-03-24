package org.problems.hash;

import java.util.HashSet;

public class Problem07_Leetcode128 {

  /*给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
  请你设计并实现时间复杂度为 O(n) 的算法解决此问题。

  示例 1：
  输入：nums = [100,4,200,1,3,2]
  输出：4
  解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。

  示例 2：
  输入：nums = [0,3,7,2,5,8,4,6,0,1]
  输出：9

  示例 3：
  输入：nums = [1,0,1,2]
  输出：3
*/
  // 因为要求时间复杂度为O(n)，所以不能先排序
  // 可以使用HashSet存储nums，首先这样的时间复杂度是O(n)
  // 然后需要找到序列起点，这个是破题点
  // 可以遍历HashSet，只有num - 1不在set里时认为是序列起点，然后从num开始向上找num+1,num+2
  // 然后不断更新最大长度
  public static int longestConsecutive(int[] nums) {

    if (nums == null || nums.length == 0) {
      return 0;
    }

    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    int longestStreak = 0;

    for (int num : set) {

      if (!set.contains(num - 1)) {
        int currentNum = num;
        int currentStreak = 1;

        while (set.contains(currentNum + 1)) {
          currentStreak++;
          currentNum++;
        }
        longestStreak = Math.max(currentStreak,longestStreak);
      }
    }

    return longestStreak;
  }
}
