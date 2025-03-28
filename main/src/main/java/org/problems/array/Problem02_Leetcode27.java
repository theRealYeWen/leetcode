package org.problems.array;

public class Problem02_Leetcode27 {

  /**
   * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。 不要使用额外的数组空间，你必须仅使用 O(1)
   * 额外空间并原地修改输入数组。 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。 示例 1: 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2,
   * 并且 nums 中的前两个元素均为 2。 你不需要考虑数组中超出新长度后面的元素。 示例 2: 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
   * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。 你不需要考虑数组中超出新长度后面的元素。
   **/

  // 快慢指针 -> 快指针寻找新数组所需要的元素，慢指针将元素更新到新数组对应的下标
  // 不能创建新数组，此题只判定新数组长度内的几个数是否正确，超出的数不判定。
  // 快指针遍历数组，查找新数组需要的元素，慢指针更新数组
  public static int removeElement(int[] nums, int val) {
    int slow = 0;

    for (int number : nums) {
      if (number != val) {
        nums[slow] = number;
        slow++;
      }
    }

    return slow;
  }
}
