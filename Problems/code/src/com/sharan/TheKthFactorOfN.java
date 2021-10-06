package com.sharan;

import java.util.ArrayList;
import java.util.Collections;

public class TheKthFactorOfN {
    public static int kthFactor(int n, int k) {
        if(n == 1 && k == 1){
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        if(k > list.size()){
            return -1;
        }
        else{
            return list.get(k -1);
        }
    }
}
