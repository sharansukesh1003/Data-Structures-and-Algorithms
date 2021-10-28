// https://leetcode.com/problems/subsets/
package com.sharan;

import java.util.ArrayList;
import java.util.List;
// 100 Faster O(N * 2n)
public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int num : arr) {
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> subSet = new ArrayList<>(ans.get(i));
                subSet.add(num);
                ans.add(subSet);
            }
        }
        return ans;
    }
}
