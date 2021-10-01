// https://leetcode.com/problems/transpose-matrix/
package com.sharan;

import java.util.Arrays;
// row column ko column row
public class TransPoseOfAMatrix {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(transpose(arr)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] answer = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                answer[j][i] = matrix[i][j];
            }
        }
        return answer;
    }
}
