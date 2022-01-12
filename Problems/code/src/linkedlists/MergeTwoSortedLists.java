// https://leetcode.com/problems/merge-two-sorted-lists/
package linkedlists;
// Comparing both lists and shifting pointer O(n) 100% Faster
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head; // tail is point to head at first
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        }
        else {
            tail.next = list2;
        }
        return head.next;
    }
}
