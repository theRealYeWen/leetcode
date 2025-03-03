package org.problems;

import org.problems.array.Problem01_Leetcode704;

import static org.problems.array.Problem04_Leetcode209.minSubArrayLen;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        System.out.println(Problem01_Leetcode704.binarySearch(nums, target));

    }

}