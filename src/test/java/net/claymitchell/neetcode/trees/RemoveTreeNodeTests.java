package net.claymitchell.neetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveTreeNodeTests {

    @Test
    void removeNodeLeftLeaf() {
        TreeNode root = new TreeNode(5);
        TreeNodeUtil.insertIntoBST(root, 3);
        TreeNodeUtil.insertIntoBST(root, 1);
        assertEquals(5, root.val);
        assertEquals(3, root.left.val);
        assertEquals(1, root.left.left.val);
        TreeNodeUtil.removeFromBST(root, 1);
        assertNull(root.left.left);
    }

    @Test
    void removeNodeRightLeaf() {
        TreeNode root = new TreeNode(1);
        TreeNodeUtil.insertIntoBST(root, 3);
        TreeNodeUtil.insertIntoBST(root, 5);
        assertEquals(1, root.val);
        assertEquals(3, root.right.val);
        assertEquals(5, root.right.right.val);
        TreeNodeUtil.removeFromBST(root, 5);
        assertNull(root.right.right);
    }

    // remove a left leaf, with right still existing
    @Test
    void removeNodeLeft() {
        TreeNode root = new TreeNode(5);
        TreeNodeUtil.insertIntoBST(root, 3);
        TreeNodeUtil.insertIntoBST(root, 1);
        TreeNodeUtil.insertIntoBST(root, 4);
        assertEquals(1, root.left.left.val);
        TreeNodeUtil.removeFromBST(root, 1);
        assertEquals(5, root.val);
        assertEquals(3, root.left.val);
        assertEquals(4, root.left.right.val);
        assertNull(root.left.left);
    }

    // remove a right leaf, with left still existing
    @Test
    void removeNodeRight() {
        TreeNode root = new TreeNode(5);
        TreeNodeUtil.insertIntoBST(root, 3);
        TreeNodeUtil.insertIntoBST(root, 1);
        TreeNodeUtil.insertIntoBST(root, 4);
        assertEquals(1, root.left.left.val);
        TreeNodeUtil.removeFromBST(root, 4);
        assertEquals(5, root.val);
        assertEquals(3, root.left.val);
        assertEquals(1, root.left.left.val);
        assertNull(root.left.right);
    }

    @Test
    void removeTopNode() {
        TreeNode root = new TreeNode(10);
        TreeNodeUtil.insertIntoBST(root, 5);
        TreeNodeUtil.insertIntoBST(root, 2);
        TreeNodeUtil.insertIntoBST(root, 15);
        TreeNodeUtil.insertIntoBST(root, 14);
        TreeNodeUtil.insertIntoBST(root, 13);
        TreeNodeUtil.insertIntoBST(root, 20);
        TreeNodeUtil.insertIntoBST(root, 25);
        TreeNodeUtil.removeFromBST(root, 10);
        assertEquals(13, root.val);
        assertNull(root.right.left.left);
    }
    @Test
    void removeMiddleNode() {
        TreeNode root = new TreeNode(10);
        TreeNodeUtil.insertIntoBST(root, 5);
        TreeNodeUtil.insertIntoBST(root, 2);
        TreeNodeUtil.insertIntoBST(root, 15);
        TreeNodeUtil.insertIntoBST(root, 14);
        TreeNodeUtil.insertIntoBST(root, 13);
        TreeNodeUtil.insertIntoBST(root, 20);
        TreeNodeUtil.insertIntoBST(root, 25);
        TreeNodeUtil.removeFromBST(root, 15);
        assertEquals(20, root.right.val);
        //assertNull(root.right.left.left);
    }

    @Test
    void removeMiddleNode2() {
        TreeNode root = new TreeNode(10);
        TreeNodeUtil.insertIntoBST(root, 5);
        TreeNodeUtil.insertIntoBST(root, 2);
        TreeNodeUtil.insertIntoBST(root, 15);
        TreeNodeUtil.insertIntoBST(root, 14);
        TreeNodeUtil.insertIntoBST(root, 13);
        TreeNodeUtil.insertIntoBST(root, 20);
        TreeNodeUtil.insertIntoBST(root, 19);
        TreeNodeUtil.insertIntoBST(root, 25);
        TreeNodeUtil.removeFromBST(root, 15);
        assertEquals(19, root.right.val);
        //assertNull(root.right.left.left);
    }
}
