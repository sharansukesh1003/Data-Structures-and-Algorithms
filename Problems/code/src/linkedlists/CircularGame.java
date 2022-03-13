package linkedlists;

public class CircularGame {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static int findTheWinner(int n, int k) {
        ListNode temp = new ListNode();
        int size = 1;
        ListNode head = temp;
        for(int i = 1; i <= n; i++) {
            temp.val = i;
            if(i == n) {
                temp.next = head;
                break;
            }
            temp.next = new ListNode();
            temp = temp.next;
            size++;
        }
        ListNode poppedNext = head;
        while(size != 1) {
            poppedNext = listPop(poppedNext, k);
            size--;
        }
        return poppedNext.val;
    }
    public static ListNode listPop(ListNode node, int k) {
        int n = 1;
        while(n < k) {
            if (n == k - 1) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
            n++;
        }
        return node;
    }
}
