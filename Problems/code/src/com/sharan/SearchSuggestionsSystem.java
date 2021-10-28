// https://leetcode.com/problems/search-suggestions-system/submissions/
package com.sharan;
// O(n^2) 75.20% Faster
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {

    }
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < searchWord.length(); i++) {
            int k = 3;
            temp += searchWord.charAt(i);
            List<String> subSet = new ArrayList<>();
            for (String product : products) {
                if (k == 0) break;
                if (product.startsWith(temp)) {
                    subSet.add(product);
                    k--;
                }
            }
            ans.add(subSet);
        }
        return ans;
    }
}
