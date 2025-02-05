package org.problems;

import java.util.Scanner;

public class Problem05_Leetcode58 {
    /*
    题目描述
    给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。

    输入描述
    第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。随后的输入为需要计算总和的区间，直至文件结束。

    输出描述
    输出每个指定区间内元素的总和。

    输入示例
        5
        1
        2
        3
        4
        5
        0 1
        1 3
    输出示例
        3
        9
    数据范围：
        0 < n <= 100000 */

    public static void calculateRange() {
        // 思路：前缀和
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] p = new int[n];

        int presum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            presum += arr[i];
            p[i] = presum;
        }

        while (sc.hasNextInt()) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            int sum;
            if (left == 0) {
                sum = p[right];
            } else {
                sum = p[right] - p[left-1];
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
