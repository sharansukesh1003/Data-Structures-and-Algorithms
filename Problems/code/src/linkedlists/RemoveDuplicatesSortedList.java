// https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
package linkedlists;
// O(n) 100% faster
public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (head == null || temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}
