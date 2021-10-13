// https://leetcode.com/problems/rotate-string/
package com.sharan;
// 5% Faster
public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s == goal) return true;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            answer.append(s.charAt(i));
        }
        int count = 0;
        while(count < answer.length()){
            answer.append(answer.charAt(0));
            answer.deleteCharAt(0);
            count++;
            if(answer.toString().equals(goal)) return true;
        }
        return false;
    }
}
