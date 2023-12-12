package net.claymitchell.neetcode.trees;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public  TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    /**
     * take a root, make a list of list in their breadth first order,
     * ie [[20], [10,30], [5,15,25,35]] etc
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> nums = new ArrayList<>();
        if(root != null) {
            queue.add(root);
        }
        int level = 0;
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            nums.add(level, levelNodes);
            level++;
        }
        return nums;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

