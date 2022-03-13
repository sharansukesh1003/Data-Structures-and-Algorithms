package com.sharan;
import java.util.ArrayList;

public class TCS{
    public static void main(String args[]) {
        System.out.println(steps2(500));
    }
    public static int steps(int n) {
        int ans = 0;
        int iterator = 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (n != 0) {
            if (n == 1) {
                ans++;
                break;
            }
            else if (n == iterator) {
                ans++;
                n = n - temp.get(temp.size() - 1);
                temp.clear();
                iterator = 1;
            }
            else if (n % iterator == 0) temp.add(iterator++);
            else iterator++;
        }

        return ans;
    }
    // Constant Space
    public static int steps2(int n){
        int count = 0;
        while(n > 0) {
            int maxDivisor = 1;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i==0) {
                    if (n / i == i) {
                        if (i == n) continue;
                        maxDivisor = Math.max(maxDivisor, i);
                    }
                    else{
                        if (i == n) continue;
                        maxDivisor = Math.max(i, maxDivisor);
                        if (n / i == n) continue;
                        maxDivisor = Math.max(maxDivisor, n / i);
                    }
                }
            }
            n = n - maxDivisor;
            count++;
        }
        return count;
    }
}
