// https://leetcode.com/problems/three-divisors/
package com.sharan;
// O(n) time complexity.
// Best case can be sqrt(n), if sqrt of n is used.
public class ThreeDivisors {
    public boolean isThree(int n) {
        int count = 0;
        if(n < 3){
            return false;
        }
        else{
            for(int i = 1 ; i <= n ; i++){
                if(n % i == 0){
                    count++;
                }
            }
        }
        return count == 3;
    }
}
