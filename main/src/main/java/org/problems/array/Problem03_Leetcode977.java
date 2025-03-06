package org.problems.array;

public class Problem03_Leetcode977 {

  /**
   * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 示例 1： 输入：nums = [-4,-1,0,3,10]
   * 输出：[0,1,9,16,100] 解释：平方后，数组变为 [16,1,0,9,100]，排序后，数组变为 [0,1,9,16,100] 示例 2： 输入：nums =
   * [-7,-3,2,3,11] 输出：[4,9,9,49,121]
   */

  // 问题的关键在于如何处理负数
  // 既然是有序的数组，那么负数的处理可以进行绝对值比较，大的塞进数组的末尾，以此类推
  // 使用双指针，双指针用于比较首位数值的绝对值大小，再用一个index将值塞入新数组
  public static int[] sortedSquares(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int[] sortedSquareArray = new int[nums.length];
    int indexOfNewArray = nums.length - 1;

    while (left <= right) {
      if (Math.abs(nums[left]) < Math.abs(nums[right])) {
        sortedSquareArray[indexOfNewArray] = nums[right] * nums[right];
        right--;
        indexOfNewArray--;
      }

      if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        sortedSquareArray[indexOfNewArray] = nums[left] * nums[left];
        left++;
        indexOfNewArray--;
      }

      if (Math.abs(nums[left]) == Math.abs(nums[right])) {
        sortedSquareArray[indexOfNewArray] = nums[left] * nums[left];
        left++;
        indexOfNewArray--;
      }
    }

    return sortedSquareArray;
  }
}
