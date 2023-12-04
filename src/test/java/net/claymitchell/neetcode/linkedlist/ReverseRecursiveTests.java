package net.claymitchell.neetcode.linkedlist;

import net.claymitchell.neetcode.linkedlist.ListNode;
import net.claymitchell.neetcode.linkedlist.ReverseIterative260;
import net.claymitchell.neetcode.linkedlist.ReverseRecursive260;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseRecursiveTests extends ReverseIterative260 {
    Function<ListNode, ListNode> method = ReverseRecursive260::reverseList;

    @Test
    @DisplayName("Test with null node")
    void testNull() {
        assertNull(method.apply(null));
    }

    @Test
    @DisplayName("Two number test")
    void testTwoNumbers() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode reversed = method.apply(head);
        assertEquals(2, reversed.val);
        assertEquals(1, reversed.next.val);
    }

    @Test
    @DisplayName("Five number test")
    void testFiveNumbers() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reversed = method.apply(head);
        assertEquals(5, reversed.val);
        assertEquals(4, reversed.next.val);
        assertEquals(3, reversed.next.next.val);
        assertEquals(2, reversed.next.next.next.val);
        assertEquals(1, reversed.next.next.next.next.val);
    }

}
