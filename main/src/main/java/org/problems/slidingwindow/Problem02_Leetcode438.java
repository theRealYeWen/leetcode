package org.problems.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem02_Leetcode438 {
  /*
  给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
  示例 1:
  输入: s = "cbaebabacd", p = "abc"
  输出: [0,6]
  解释:
  起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
  起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。

  示例 2:
  输入: s = "abab", p = "ab"
  输出: [0,1,2]
  解释:
  起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
  起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
  起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
*/

  // 之前做过一道异位词的题，是先把字符串排序，然后结合HashMap一起搞
  // 破题点我觉得是在说如何比较
  // 这道题的话可以结合滑动窗口和一个字符频率数组来解答
  public static List<Integer> findAnagrams(String s, String p) {
    if (s == null || p == null || s.length()<p.length()) {
      return new ArrayList<>();
    }

    ArrayList<Integer> result = new ArrayList<>();

    int[] target = new int[26];
    int[] window = new int[26];

    //先遍历s，更新目标数组中的字符频率
    for (char c : p.toCharArray()) {
      target[c - 'a']++;
    }

    int pLen = p.length();
    int sLen = s.length();

    // 先初始化窗口
    for (int i = 0; i < pLen; i++) {
      window[s.charAt(i) - 'a']++;
    }

    // 如果初始窗口一样的话那么可以直接返回0的索引下标
    if (Arrays.equals(target, window)) {
      result.add(0);
    }

    // 移动滑动窗口，更新window数组，直至和target里的字符数组完全匹配
    for (int i = pLen; i < sLen; i++) {
      char newChar = s.charAt(i);
      char oldChar = s.charAt(i - pLen);

      window[newChar - 'a']++;
      window[oldChar - 'a']--;

      if (Arrays.equals(target, window)){
        result.add(i - pLen + 1);
      }
    }
    return result;
  }
}
