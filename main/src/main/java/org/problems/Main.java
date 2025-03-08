package org.problems;

import org.problems.array.Problem04_Leetcode209;

public class Main {

  public static void main(String[] args) {
    int[] nums = {1,4,4};
    int target = 4;

    int result = Problem04_Leetcode209.minSubArrayLen(target, nums);

    System.out.println(result);
  }

}