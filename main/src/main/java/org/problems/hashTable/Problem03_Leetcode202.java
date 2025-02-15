package org.problems.hashTable;

import java.util.HashSet;
import java.util.Set;

public class Problem03_Leetcode202 {
    /*
    编写一个算法来判断一个数 n 是不是快乐数。
    快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
    也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
    如果 n 是快乐数就返回 True ；不是，则返回 False 。

    示例：
    输入：19
    输出：true
    解释：
        1^2 + 9^2 = 82
        8^2 + 2^2 = 68
        6^2 + 8^2 = 100
        1^2 + 0^2 + 0^2 = 1
    */
    // 使用hashSet来记录计算过程中的数，如果已经在set中出现过，则说明循环
    public boolean isHappy(int n) {
        // 用于记录已经出现过的数
        Set<Integer> record = new HashSet<>();

        // 当n不等于1且n没有出现在record集合中时，继续循环
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }

        // 如果n等于1，说明是快乐数
        return n == 1;
    }

    // 计算数字的每个位的平方和
    private int getNextNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp; // 取最后一位数字
            n = n / 10; // // 去掉最后一位，继续求下一位平方和
        }

        return sum;
    }
}
