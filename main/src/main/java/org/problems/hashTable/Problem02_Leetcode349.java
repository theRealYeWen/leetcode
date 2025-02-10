package org.problems.hashTable;

import java.util.HashSet;
import java.util.Set;

public class Problem02_Leetcode349 {
    /*
    给定两个数组 nums1 和 nums2 ，返回它们的交集。
    输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
    示例 1：
    输入：nums1 = [1,2,2,1], nums2 = [2,2]
    输出：[2]

    示例 2：
    输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    输出：[9,4]
    解释：[4,9] 也是可通过的

    提示：

            1 <= nums1.length, nums2.length <= 1000
            0 <= nums1[i], nums2[i] <= 1000
    */

    // 遍历数组1加入set1，再遍历数组2，若数组2元素存在于set1，则加入set2，最后输出结果数组
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int n1 : nums1) {
            set1.add(n1);
        }

        for (int n2 : nums2) {
            if (set1.contains(n2)) {
                resultSet.add(n2);
            }
        }

        return resultSet.stream().mapToInt(i -> i).toArray();
    }
}
