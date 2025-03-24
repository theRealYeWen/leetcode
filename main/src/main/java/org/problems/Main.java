package org.problems;

import java.util.List;
import org.problems.hashTable.Problem06_Leetcode049;

public class Main {

  public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> resultLists = Problem06_Leetcode049.groupAnagrams(strs);

    System.out.println(resultLists);
  }

}