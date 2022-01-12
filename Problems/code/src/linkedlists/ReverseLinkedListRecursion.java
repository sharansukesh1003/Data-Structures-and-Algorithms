// https://leetcode.com/problems/reverse-linked-list/
package linkedlists;
// 100% Faster O(n) In-place reversal

public class ReverseLinkedListRecursion {
    // Linked List reversal using recursion with given tail.
//    public void reverseLinkedList(ListNode node) {
//        if(node == tail) {
//            node = head;
//            return;
//        }
//        reverseLinkedList(node);
//        tail.next = node;
//        node = tail;
//        tail.next = null;
//    }
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next; //next is taken since present is modified.
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) next = next.next;
        }
        return prev;
    }
}
