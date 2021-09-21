package com.sharan;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int number = in.nextInt();
//        boolean bool = isPerfectSquareOrNot(number);
        int ans = givePerfectSquare(number);
        System.out.println(ans);
    }

    public static boolean isPerfectSquareOrNot(int num) {
        for (int i = 0; i < num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static int givePerfectSquare(int num) {
        for (int i = 0; i <= num; i++) {
            if (i * i == num) {
                return i;
            } else if (i * i > num) {
                return i - 1;
            }
        }
        return 0;
    }
}

