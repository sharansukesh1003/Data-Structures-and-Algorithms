// https://leetcode.com/problems/valid-perfect-square/
package com.sharan;
// 100% faster
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int x) {
        long start  = 0;
        long end = x;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if(mid * mid == x){
                return true;
            }
            else if(mid * mid > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
