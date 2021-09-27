// https://leetcode.com/problems/merge-strings-alternately/

package com.sharan;

public class StringMergeAlternateStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while(i < word1.length() + word2.length()){
            if(i < word1.length()){
                answer.append(word1.charAt(i));
            }
            if(i < word2.length()){
                answer.append(word2.charAt(i));
            }
            i++;
        }
        return String.valueOf(answer);
    }
}
