package com.sharan;

import java.util.Scanner;

public class StrangerThings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(killMonsters(n, arr, k));
    }
    public static int killMonsters(int n, int[] weapons, int k) {
        int iterator = 1;
        int count = 0;
        boolean[] arr = new boolean[k + 1];
        for(int i = 0; i <= k; i++) arr[i] = false;
        for (int weapon : weapons) {
            if (!arr[weapon]) {
                while (weapon * iterator <= k) {
                    arr[weapon * iterator] = true;
                    iterator++;
                }
            }
            iterator = 1;
        }
        for(int m = 1; m <= k; m++) if(arr[m]) count++;
        return count;
    }
}

class DiagonalString {
    static void pattern(String str) {
        for (int i = 0; i < str.length(); i++) {
            int j = str.length() - 1 - i;
            for (int k = 0; k < str.length(); k++) {
                if (k == i || k == j) System.out.print(str.charAt(k));
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        pattern(str);
    }
}
