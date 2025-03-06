package org.problems;

import java.util.ArrayList;
import java.util.Arrays;
import org.problems.array.Problem03_Leetcode977;

public class Main {

  public static void main(String[] args) {
    int[] nums = {-7,-3,2,3,11};

    int[] result = Problem03_Leetcode977.sortedSquares(nums);

    System.out.println(Arrays.toString(result));
  }

}