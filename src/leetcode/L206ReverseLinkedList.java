package leetcode;

public class L206ReverseLinkedList {

    public ListNode reverseList(final ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public class ListNode {

        int val;
        ListNode next;

        ListNode(final int x) {
            val = x;
        }
    }
}
