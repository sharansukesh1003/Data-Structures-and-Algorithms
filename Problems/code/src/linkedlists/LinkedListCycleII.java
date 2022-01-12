// https://leetcode.com/problems/linked-list-cycle-ii/
package linkedlists;
// Using cycle detection. O(n) Time 48% faster
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        int length = cycleDetection(head);
        if(length == 0) return null;
        ListNode first = head;
        ListNode second = head;
        while(length > 0) {
            first = first.next;
            length--;
        }
        while(first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }
    // detect the cycle if none length will be zero.
    public int cycleDetection(ListNode node) {
        int length = 0;
        ListNode fast = node;
        ListNode slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                do {
                    slow = slow.next;
                    length++;
                } while(fast != slow);
                return length;
            }
        }
        return length;
    }
}
