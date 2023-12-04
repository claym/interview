package net.claymitchell.neetcode.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLinkedListTest {

    @Test
    @DisplayName("Default example")
    void example() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        assertEquals(2, myLinkedList.get(1));              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        assertEquals(3, myLinkedList.get(1)); // return 3
    }

    @Test
    @DisplayName("first failed")
    /**
     * ["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
     * [[],             [7],        [2],        [1],        [3,0],      [2],             [6],       [4],        [4],    [4],        [5,0],      [6]]
     * [null,           null,       null,       null,       null,       null,           null,       null,       4,      null,       null,       null]
     */
    void failure1() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7); // 7
        assertEquals(7, myLinkedList.get(0));
        myLinkedList.addAtHead(2); // 2 - 7
        assertEquals(2, myLinkedList.get(0));
        assertEquals(7, myLinkedList.get(1));
        myLinkedList.addAtHead(1); // 1 - 2 - 7
        assertEquals(1, myLinkedList.get(0));
        assertEquals(2, myLinkedList.get(1));
        assertEquals(7, myLinkedList.get(2));
        myLinkedList.addAtIndex(3, 0); // 1 - 2 - 7 - 0
        assertEquals(0, myLinkedList.get(3));
        myLinkedList.deleteAtIndex(2); // 1 - 2 - 0
        assertEquals(0, myLinkedList.get(2));
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        assertEquals(4, myLinkedList.get(4));
        myLinkedList.addAtHead(4);
        myLinkedList.addAtIndex(5, 0);
        myLinkedList.addAtHead(6);

    }

    @Test
    /**
     * ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
     * [[],             [2],        [1],            [2],        [7],        [3],        [2],        [5],        [5],        [5],    [6],            [4]]
     * [null,           null,       null,           null,       null,       null,       null,       null,       null,       2,      null,           null]
     */
    void failure2() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(2);
        assertEquals(2, myLinkedList.get(0));
        myLinkedList.deleteAtIndex(1);
        assertEquals(2, myLinkedList.get(0));
        myLinkedList.addAtHead(2);
        assertEquals(2, myLinkedList.get(0));
        assertEquals(2, myLinkedList.get(1));
        myLinkedList.addAtHead(7);
        assertEquals(7, myLinkedList.get(0));
        assertEquals(2, myLinkedList.get(1));
        assertEquals(2, myLinkedList.get(2));

    }

}
