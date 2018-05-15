package leetcode;

public class L2AddTwoNumbers {

    public ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {
        int addition = 0;
        final ListNode newHead = new ListNode(0);
        ListNode curNode = newHead;
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        while (l1Cur != null && l2Cur != null) {
            final int cur = l1Cur.val + l2Cur.val + addition;
            curNode.next = new ListNode(cur % 10);
            curNode = curNode.next;
            addition = cur / 10;
            l1Cur = l1Cur.next;
            l2Cur = l2Cur.next;
        }

        ListNode extra = l1Cur != null ? l1Cur : l2Cur;

        while (extra != null) {
            final int cur = extra.val + addition;
            curNode.next = new ListNode(cur % 10);
            curNode = curNode.next;
            extra = extra.next;
            addition = cur / 10;
        }

        if (addition != 0) {
            curNode.next = new ListNode(addition);
        }

        return newHead.next;
    }
}
