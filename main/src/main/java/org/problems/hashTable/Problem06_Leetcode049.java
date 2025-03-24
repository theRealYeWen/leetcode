package org.problems.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem06_Leetcode049 {

  /*给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
  字母异位词 是由重新排列源单词的所有字母得到的一个新单词。

  示例 1:
  输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
  输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

  示例 2:
  输入: strs = [""]
  输出: [[""]]

  示例 3:
  输入: strs = ["a"]
  输出: [["a"]]
*/
  // 破题的关键是如何判定是字母异位词-可以遍历数组，然后对取出来的字符串进行排序
  // 将排序后的字符串作为hashMap的key, 若之后有字符串排序后获得一样的key，则认为是字母异位词。
  public static List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    HashMap<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);

      String key = new String(charArray);

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(str);
    }

   return new ArrayList<>(map.values());
  }
}
