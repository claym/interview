package net.claymitchell.neetcode.linkedlist;

import java.util.HashMap;

public class LRUCache {

    int capacity;
    ListKeyNode head; // sentinel node w/ no content
    ListKeyNode tail; // same
    HashMap<Integer, ListKeyNode> values;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        values = new HashMap<>();
        head = new ListKeyNode();
        tail = new ListKeyNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!values.containsKey(key)) {
            return -1;
        }
        ListKeyNode node = values.get(key);
        remove(node); // remove it from wherever it is in the list
        add(node); // add it back at the end;
        return node.val;
    }

    public void put(int key, int value) {
        // if key already exists, we want to remove it and add to end
        if(values.containsKey(key)) {
            ListKeyNode node = values.get(key);
            remove(node);
        }
        ListKeyNode node = new ListKeyNode(key, value);
        values.put(key, node);
        add(node);
        if(values.size() > capacity) {
            ListKeyNode remove = head.next;
            remove(remove);
            values.remove(remove.key);
        }
    }

    // functions to do linked list stuff
    public void add(ListKeyNode node) {
        ListKeyNode oldLast = tail.prev;
        oldLast.next = node;
        node.prev = oldLast;
        node.next = tail;
        tail.prev = node;
    }

    public void remove(ListKeyNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
