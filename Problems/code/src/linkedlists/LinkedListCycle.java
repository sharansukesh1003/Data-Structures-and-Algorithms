// https://leetcode.com/problems/linked-list-cycle/
package linkedlists;
// O(n) 100% Faster Using fast and slow pointer method
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
