package net.claymitchell.neetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TreeNodeUtilTests {

    @Test
    void levelOrderTest() {
        TreeNode root = new TreeNode(20);
        TreeNodeUtil.insertIntoBST(root, 10);
        TreeNodeUtil.insertIntoBST(root, 30);
        TreeNodeUtil.insertIntoBST(root, 5);
        TreeNodeUtil.insertIntoBST(root, 15);
        TreeNodeUtil.insertIntoBST(root, 25);
        TreeNodeUtil.insertIntoBST(root, 35);

    }

    @Test
    void createTree() {
        Integer[] nums = new Integer[] {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode root = TreeNodeUtil.createTree(nums);
        assertEquals(5, root.val);
        assertEquals(4, root.left.val);
        assertEquals(11, root.left.left.val);
        assertNull(root.left.right);
        assertEquals(7, root.left.left.left.val);
        assertEquals(2, root.left.left.right.val);
        assertEquals(8, root.right.val);
        assertEquals(13, root.right.left.val);
        assertEquals(4, root.right.right.val);
        assertEquals(1, root.right.right.right.val);
        assertNull(root.right.right.left);

    }

}
