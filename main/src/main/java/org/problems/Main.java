package org.problems;

import java.util.List;
import org.problems.array.Problem09_Leetcode015;
import org.problems.array.Problem10_Leetcode011;
import org.problems.slidingwindow.Problem01_Leetcode003;

public class Main {

  public static void main(String[] args) {
    String s = "abcabcbb";
    int result = Problem01_Leetcode003.lengthOfLongestSubstring(s);

    System.out.println(result);
  }

}