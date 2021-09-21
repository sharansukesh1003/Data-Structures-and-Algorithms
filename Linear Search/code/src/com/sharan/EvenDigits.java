package com.sharan;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {11,222,3333,44444,55,66,77777777};
        System.out.println(evenNumberDigits(nums));
    }

    static int evenNumberDigits(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenDigit(nums[i])) {
                count ++;
            }
            }
        return count;
        }
// Math.log10(num) would give the number of digits too.
    static boolean isEvenDigit(int value) {
        int digitCount = 0;
        while (value > 0) {
            digitCount++;
            value = value / 10;
        }
        return digitCount%2 == 0;
    }
}

