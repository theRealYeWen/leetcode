package org.problems;

public class Problem06_Leetcode59 {
    /*给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

    示例:

    输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]*/

    public int[][] generateMatrix(int n) {
        int nums[][] = new int[n][n];
        int startX = 0, startY = 0;
        int loop = 1;
        int offset = 1; // 边界值，随着圈数增加而减少
        int count = 1; // 待填充的值，从1开始计数
        int i, j;

        while (loop <= n / 2) {
            //从左往右
            for (j = startY; j < n - offset; j++) {
                nums[startX][j] = count++;
            }

            // 从右往下
            for (i = startX; i < n - offset; i++) {
                nums[i][j] = count++;
            }

            // 从右往左
            for (; j > startY; j--) {
                nums[i][j] = count++;
            }

            //从左往上
            for (; i > startX; i--) {
                nums[i][j] = count++;
            }

            startX++;
            startY++;
            loop++;
            offset++;
        }

        if (n % 2 == 1) { // n 为奇数时，单独处理矩阵中心的值
            nums[startX][startY] = count;
        }

        return nums;
    }
}
