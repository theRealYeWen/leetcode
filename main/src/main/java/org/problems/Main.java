package org.problems;

import java.util.List;
import org.problems.array.Problem09_Leetcode015;
import org.problems.array.Problem10_Leetcode011;
import org.problems.slidingwindow.Problem01_Leetcode003;
import org.problems.slidingwindow.Problem02_Leetcode438;

public class Main {

  public static void main(String[] args) {
    String s = "cbaebabacd";
    String p = "abc";
    List<Integer> anagrams = Problem02_Leetcode438.findAnagrams(s, p);

    System.out.println(anagrams);
  }

}