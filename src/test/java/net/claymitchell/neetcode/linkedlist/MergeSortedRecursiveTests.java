package net.claymitchell.neetcode.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeSortedRecursiveTests {

    MergedSortedRecursive21 ms = new MergedSortedRecursive21();

    @Test
    @DisplayName("Send two null ListNodes")
    void twoNulls() {
        ListNode node = ms.mergeTwoLists(null, null);
        assertNull(node);
    }

    @Test
    @DisplayName("First null")
    void firstNull() {
        ListNode node = ms.mergeTwoLists(null, new ListNode(1));
        assertEquals(1, node.val);
    }

    @Test
    @DisplayName("Second null")
    void secondNull() {
        ListNode node = ms.mergeTwoLists(new ListNode(1), null);
        assertEquals(1, node.val);
    }

    @Test
    @DisplayName("Real test")
    void realTest() {
        ListNode one = ListNode.build(new int[]{1,3});
        ListNode two = ListNode.build(new int[]{2,4});
        ListNode node = ms.mergeTwoLists(one, two);
        assertEquals(1, node.val);
        assertEquals(2, node.next.val);
        assertEquals(3, node.next.next.val);
        assertEquals(4, node.next.next.next.val);
    }

    @Test
    @DisplayName("ListNode one has more than two")
    void unevenOneTest() {
        ListNode one = ListNode.build(new int[]{1,3,5});
        ListNode two = ListNode.build(new int[]{2,4});
        ListNode node = ms.mergeTwoLists(one, two);
        assertEquals(1, node.val);
        assertEquals(2, node.next.val);
        assertEquals(3, node.next.next.val);
        assertEquals(4, node.next.next.next.val);
        assertEquals(5, node.next.next.next.next.val);
    }

    @Test
    @DisplayName("ListNode two has more than one")
    void unevenTwoTest() {
        ListNode one = ListNode.build(new int[]{1,3});
        ListNode two = ListNode.build(new int[]{2,4, 5});
        ListNode node = ms.mergeTwoLists(one, two);
        assertEquals(1, node.val);
        assertEquals(2, node.next.val);
        assertEquals(3, node.next.next.val);
        assertEquals(4, node.next.next.next.val);
        assertEquals(5, node.next.next.next.next.val);
    }

}
