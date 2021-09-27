package com.sharan;

// 3 step to print any pattern
// Consider the pattern to be a 2D Matrix.
// (1) Count the number of rows (n). (Outer for loop would run n - 1 times)
// (2) Count the number of columns associated with the row.(Inner for loop)
// (3) Check what to print.

public class StringPattern {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n) {
        int p = 2;
        for (int i = 0; i < n * 2; i++) {
            if (i < n){
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int k = (i+1) - p; k > 0; k--) {
                    System.out.print("* ");
                }
                p += 2;
            }
            System.out.println();
        }
    }
}
