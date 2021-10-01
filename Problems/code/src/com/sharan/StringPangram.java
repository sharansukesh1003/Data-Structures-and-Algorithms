// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
package com.sharan;

public class StringPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        int count = 0;
        if(sentence.length() < 26){
            return false;
        }
        for(int i = 96; i < 123; i++){
            for(int j = 0; j < sentence.length(); j++){
                if((char) i == sentence.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count == 26 ? true : false;
    }
}
