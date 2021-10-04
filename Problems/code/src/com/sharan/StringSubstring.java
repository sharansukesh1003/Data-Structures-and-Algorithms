// https://leetcode.com/problems/maximum-repeating-substring/
package com.sharan;

public class StringSubstring {
    public int maxRepeating(String sequence, String word) {
        StringBuilder tempString = new StringBuilder(word);
        int count = 0;
        while(tempString.length() <= sequence.length()){
            if(sequence.contains(tempString.toString())){
                count++;
                tempString.append(word);
            }
            else{
                return count;
            }
        }
        return count;
    }
}
