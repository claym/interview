package net.claymitchell.neetcode.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreePathSumTests {

    @Test
    void pathSum1() {
        Integer[] nums = new Integer[] {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode root = TreeNodeUtil.createTree(nums);
        assertTrue(TreeNodeUtil.pathSum(root, 22));
    }

    @Test
    void pathSum2() {
        Integer[] nums = new Integer[] {1,2,3};
        TreeNode root = TreeNodeUtil.createTree(nums);
        assertFalse(TreeNodeUtil.pathSum(root, 5));
    }
}
