package net.claymitchell.neetcode.linkedlist;

import net.claymitchell.neetcode.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ListNodeTests {
    @Test
    @DisplayName("empty array")
    void emptyArray() {
        ListNode node = ListNode.build(new int[0]);
        assertNull(node);
    }

    @Test
    @DisplayName("single value")
    void singleValue() {
        ListNode node = ListNode.build(new int[] {1});
        assertEquals(1, node.val);
    }

    @Test
    @DisplayName("multi value")
    void multiValue() {
        ListNode node = ListNode.build(new int[] {1, 2, 3, 4});
        assertEquals(1, node.val);
        assertEquals(2, node.next.val);
        assertEquals(3, node.next.next.val);
        assertEquals(4, node.next.next.next.val);
    }


}
