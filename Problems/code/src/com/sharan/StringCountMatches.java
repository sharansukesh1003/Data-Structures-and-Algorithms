// https://leetcode.com/problems/count-items-matching-a-rule/
package com.sharan;

import java.util.List;
import java.util.Objects;

public class StringCountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j;
        if(Objects.equals(ruleKey, "type")){
            j=0;
        }
        else if(Objects.equals(ruleKey, "color")){
            j=1;
        }
        else{
            j=2;
        }
        int count = 0;
        for(int i = 0; i < items.size(); i++){
            if(Objects.equals(items.get(i).get(j), ruleValue)){
                count++;
            }
        }
        return count;
    }
}
