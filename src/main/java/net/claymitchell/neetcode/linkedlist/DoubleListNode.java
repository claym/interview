package net.claymitchell.neetcode.linkedlist;

public class DoubleListNode {

    int val;
    public DoubleListNode prev;
    public DoubleListNode next;

    public DoubleListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

}
