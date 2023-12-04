package net.claymitchell.neetcode.linkedlist;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static ListNode build(int[] values) {
        if(values.length == 0) {
            return null;
        }
        ListNode head = null;
        ListNode prev = null;
        for(int i : values) {
            ListNode node = new ListNode(i);
            if(head == null) {
                head = node;
                prev = head;
            } else {
                prev.next = node;
                prev = prev.next;
            }
        }
        return head;
    }

}
