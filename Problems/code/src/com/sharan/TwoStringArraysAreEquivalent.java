// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
package com.sharan;

public class TwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean answer;
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < word1[i].length() ; j++) {
                temp1.append(word1[i].charAt(j));
            }
        }
        for (int k = 0; k < word2.length; k++) {
            for (int l = 0; l < word2[k].length() ; l++) {
                temp2.append(word2[k].charAt(l));
            }
        }
        if(temp1.toString().equals(temp2.toString())){
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}
