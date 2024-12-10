package org.problems;

import static org.problems.Problem04_Leetcode209.minSubArrayLen;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;

        System.out.println(minSubArrayLen(target, nums));
    }

}