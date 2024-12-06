package org.problems;

import static org.problems.Problem02_Leetcode27.removeElement;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums, val));
    }

}