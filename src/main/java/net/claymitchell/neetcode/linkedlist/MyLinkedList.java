package net.claymitchell.neetcode.linkedlist;

public class MyLinkedList {

    private DoubleListNode head;
    private DoubleListNode tail;
    private int length;

    public MyLinkedList() {

    }

    public int get(int index) {
        DoubleListNode node = getNode(index);
        if(node == null)
            return -1;
        return node.val;
    }

    private DoubleListNode getNode(int index) {
        if(head == null)
            return null;
        if(index == 0)
            return head;
        int i=0;
        DoubleListNode node = head;
        while(node != null) {
            if(i == index) {
                return node;
            }
            node = node.next;
            i++;
        }
        return null;
    }

    public void addAtHead(int val) {
        DoubleListNode node = new DoubleListNode(val);
        if(head == null) {
            head = node;
            tail = node;
            length++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        length++;
    }

    public void addAtTail(int val) {
        if(tail == null) {
            addAtHead(val);
            return;
        }

        DoubleListNode node = new DoubleListNode(val);
        node.prev = tail;
        tail.next = node;
        tail = node;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(index == 0) {
            addAtHead(val);
            return;
        }
        // see if we're adding it at the end
        if(index == length) {
            addAtTail(val);
            return;
        }
        DoubleListNode currentNode = getNode(index);
        if(currentNode == null)  {
            return;
        }
        DoubleListNode newNode = new DoubleListNode(val);
        DoubleListNode prev = currentNode.prev;
        currentNode.prev = newNode;
        newNode.next = currentNode;
        newNode.prev = prev;
        prev.next = newNode;
        length++;
    }

    public void deleteAtIndex(int index) {
        // if one node list
        if(index == 0 && head == tail) {
            head = null;
            tail = null;
            length = 0;
            return;
        }

        DoubleListNode currentNode = getNode(index);
        if(currentNode == null) {
            return;
        }

        DoubleListNode prev = currentNode.prev;
        DoubleListNode next = currentNode.next;


        // if deleting end node
        if(currentNode.next == null) {
            prev.next = null;
            tail = prev;
            length--;
            return;
        }
        // if deleting first node;
        if(currentNode.prev == null) {
            next.prev = null;
            head = next;
            length--;
            return;
        }
        prev.next = next;
        next.prev = prev;
        length--;
    }
}
