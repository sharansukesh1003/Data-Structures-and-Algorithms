package com.sharan;

public class StringGoalParserInterpretation {
    public static void main(String[] args) {
        String s = "G()(al)";
       interpret(s);
    }
    static String interpret(String command) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G'){
                s.append('G');
            }
            else if (command.charAt(i) == '('){
               if (command.charAt(i+1) == 'a'){
                   s.append("al");
               }
               else {
                   s.append('o');
               }
            }
        }
        return String.valueOf(s);
    }
}
