// https://leetcode.com/problems/shuffle-string/
package com.sharan;

public class StringShuffleString {
    public static void main(String[] args) {
        String answer = restoreString("codeleet",new int[] {4,5,6,7,0,2,1,3});
        System.out.println(answer);
    }
    static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
