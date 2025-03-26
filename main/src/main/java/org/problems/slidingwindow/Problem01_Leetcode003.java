package org.problems.slidingwindow;

import java.util.HashMap;

public class Problem01_Leetcode003 {
  /*
  给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
  示例 1:
  输入: s = "abcabcbb"
  输出: 3
  解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

  示例 2:
  输入: s = "bbbbb"
  输出: 1
  解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

  示例 3:
  输入: s = "pwwkew"
  输出: 3
  解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
  请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
*/

  // 使用滑动窗口思想，通过维护一个窗口（子串），保证窗口内的字符不重复。
  // 当遇到重复字符时，需要调整窗口左侧位置，直到窗口内不再含有重复字符，从而在遍历过程中不断更新最长子串长度。
  public static int lengthOfLongestSubstring(String s) {

    // 使用HashMap可以存储元素和元素对应的下标关系，而HashSet只能判断元素是否存在
    HashMap<Character, Integer> map = new HashMap<>();

    int left = 0;
    int maxLen = 0;

    // 有了left，有了right，有了for循环，其实就有了窗口
    for (int right = 0; right < s.length(); right++) {
      // 先获取right下表的字符
      char c = s.charAt(right);

      // 如果字符在map里不存在，则说明窗口内不存在重复字符
      // 若存在，则说明有重复字符，应该易懂左边窗口位置
      if (map.containsKey(c)) {
        left = Math.max(left, map.get(c) + 1);
      }

      map.put(s.charAt(right), right);
      maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
  }

}
