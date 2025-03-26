package org.problems;

import java.util.List;
import org.problems.array.Problem09_Leetcode015;
import org.problems.array.Problem10_Leetcode011;
import org.problems.slidingwindow.Problem01_Leetcode003;
import org.problems.slidingwindow.Problem02_Leetcode438;
import org.problems.slidingwindow.Problem03_Leetcode560;

public class Main {

  public static void main(String[] args) {
    int[] nums = {1,1,1};
    int k = 2;

    int result = Problem03_Leetcode560.subarraySum(nums, k);

    System.out.println(result);
  }

}