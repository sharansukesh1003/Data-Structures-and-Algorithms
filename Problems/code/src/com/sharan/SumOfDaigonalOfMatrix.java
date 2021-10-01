package com.sharan;

public class SumOfDaigonalOfMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int start = 0;
        int end = mat.length - 1;
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            if(start == mat.length && end < 0){
                break;
            }
            if(start == end){
                sum+= mat[i][start];
                start++;
                end--;
            }
            else{
                sum += mat[i][start] + mat[i][end];
                start++;
                end--;
            }
        }
        return sum;
    }
}
