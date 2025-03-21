package org.problems;

import java.util.List;
import org.problems.array.Problem_08_Leetcode007;

public class Main {

  public static void main(String[] args) {
    int[] nums =  {-1,0,1,2,-1,-4};

    List<List<Integer>> result = Problem_08_Leetcode007.threeSum(nums);

    System.out.println(result);
  }

}