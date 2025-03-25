package org.problems;

import java.util.List;
import org.problems.array.Problem09_Leetcode015;

public class Main {

  public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
    List<List<Integer>> lists = Problem09_Leetcode015.threeSum(nums);

    System.out.println(lists);
  }

}