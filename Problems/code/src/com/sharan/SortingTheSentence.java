// https://leetcode.com/problems/sorting-the-sentence/
package com.sharan;
// incomplete
import java.util.Arrays;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        sortSentence("Myself2 Me1 I4 and3");
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
    }
    static String sortSentence(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = new String[s.strip().length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                for (int j = i-1; j >= 0; j--){
                    if(s.charAt(j) == ' '){
                        break;
                    }
                    if (Character.isDigit(s.charAt(i))){
                        answer.append(s.charAt(j));

                    }
                }
                arr[i-1] = answer.toString();
                answer.append(' ');
            }
        }
        answer.reverse();
        System.out.println(answer);
        return String.valueOf(answer);
    }
}
