package leetcode;

/**
 * Created by leo on 8/22/18.
 */
public class L237DeleteNodeinaLinkedList {

    public void deleteNode(final ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public class ListNode {

        int val;
        ListNode next;

        ListNode(final int x) {
            val = x;
        }
    }
}
