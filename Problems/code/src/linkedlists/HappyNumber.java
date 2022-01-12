// https://leetcode.com/problems/happy-number/
package linkedlists;
// 100% Faster using linked list cycle detection algorithm.

public class HappyNumber {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = squareRoot(slow);
            fast = squareRoot(squareRoot(fast));
        } while(fast != slow);
        return slow == 1;
    }
    public int squareRoot(int number) {
        int ans = 0;
        while(number > 0) {
            int remainder = number % 10;
            ans += remainder * remainder;
            number /= 10;
        }
        return ans;
    }
}
