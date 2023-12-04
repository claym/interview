package net.claymitchell.neetcode.linkedlist;

public class ReverseIterative260 {

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode newHead = null;
        while(current != null) {
            ListNode prev = newHead;
            newHead = new ListNode(current.val);
            newHead.next = prev;
            current = current.next;
        }
        return newHead;
    }
}
