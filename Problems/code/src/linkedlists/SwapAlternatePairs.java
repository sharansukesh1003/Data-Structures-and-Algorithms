package linkedlists;

public class SwapAlternatePairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        while(first != null) {
            first.next = second.next;
            second.next = first;
            first = first.next;
            second = second.next.next;
        }
        return head;
    }
}
