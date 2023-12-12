package net.claymitchell.neetcode.trees;

import org.junit.jupiter.api.Test;

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

}
