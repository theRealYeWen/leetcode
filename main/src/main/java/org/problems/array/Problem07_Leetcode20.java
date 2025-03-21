package org.problems.array;

import java.util.Stack;

public class Problem07_Leetcode20 {
  /*
  编写一个函数来检查输入字符串是否有效：
  给定一个仅包含字符'('、')'、'{'、'}'、'['和']'的字符串 s ，判断输入字符串是否有效。
  一个输入字符串有效需满足：
      - 左括号必须用相同类型的右括号闭合。
      - 左括号必须以正确的顺序闭合
   */

  public static Boolean isValidString(String str) {
    Stack<Character> charactersStack = new Stack<>();

    for (char c : str.toCharArray()) {
      if ('(' == c) {
        charactersStack.push(c);
      } else if ('{' == c) {
        charactersStack.push(c);
      } else if ('[' == c) {
        charactersStack.push(c);
      } else {
        if (charactersStack.isEmpty() || charactersStack.pop() != c) {
          return false;
        }
      }
    }
    return charactersStack.isEmpty();
  }
}
