package net.claymitchell.neetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertTreeNodeTests {

    @Test
    void insertLeftLeaf() {
        TreeNode root = new TreeNode(5);
        TreeNode.insertIntoBST(root, 4);
        assertEquals(4, root.left.val);
        TreeNode.insertIntoBST(root, 3);
        assertEquals(3, root.left.left.val);
    }

    @Test
    void insertRightLeft() {
        TreeNode root = new TreeNode(5);
        TreeNode.insertIntoBST(root, 6);
        assertEquals(6, root.right.val);
        TreeNode.insertIntoBST(root, 7);
        assertEquals(7, root.right.right.val);
    }

    @Test
    void insertMixed() {
        TreeNode root = new TreeNode(10);
        TreeNode.insertIntoBST(root, 15);
        assertEquals(15, root.right.val);
        TreeNode.insertIntoBST(root, 5);
        assertEquals(5, root.left.val);
        TreeNode.insertIntoBST(root, 8);
        assertEquals(8, root.left.right.val);
        TreeNode.insertIntoBST(root, 12);
        assertEquals(12, root.right.left.val);
    }

}
