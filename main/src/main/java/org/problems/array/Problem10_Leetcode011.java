package org.problems.array;

public class Problem10_Leetcode011 {

  /*
  给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
  找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
  返回容器可以储存的最大水量。
  输入：[1,8,6,2,5,4,8,3,7]
  输出：49
  解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

  示例 2：
  输入：height = [1,1]
  输出：1
  */

  // 容器容纳水的面积取决于两边最短的那根垂线
  // 假设我们固定左右两端，那么容器的面积就是min(height[i],height[j])*(j-i)
  // 当我们想要寻求最大的面积时，假设移动较长的一侧，由于较短的一侧决定高度，容器面积一定不会变大
  // 假设移动较短的一侧，那么有可能遇到更高的线，从而提高容器面积，即使宽度减小了，也有可能得到更大的面积
  public static int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
      int currentArea = Math.min(height[left], height[right]) * (right - left);
      maxArea = Math.max(maxArea, currentArea);

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }
}
