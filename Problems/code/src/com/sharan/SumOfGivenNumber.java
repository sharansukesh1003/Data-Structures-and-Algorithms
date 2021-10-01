// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
package com.sharan;
//Recursion

public class SumOfGivenNumber {
    public static void main(String[] args) {
        System.out.println(sum(45632,0));
    }
    public static int sum(int n,int sum){
        if(n <= 0){
            return sum;
        }
        sum += n%10;
        n /= 10;
        return sum(n,sum);
    }
}
