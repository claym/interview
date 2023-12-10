package net.claymitchell.neetcode.trees;


// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

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



    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val > val)
            return searchBST(root.left, val);
        if (root.val < val)
            return searchBST(root.right, val);

        return root;
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public static TreeNode removeFromBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            root.left = removeFromBST(root.left, val);
        } else if (val > root.val) {
            root.right = removeFromBST(root.right, val);
        } else {
            if(root.right == null && root.left == null) {
                return null;
            }
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return root.left;
            }

            TreeNode minNode = findMinimum(root.right);
            root.val = minNode.val;
            root.right = removeFromBST(root.right, minNode.val);
        }
        return root;
    }

    private static TreeNode findMinimum(TreeNode root) {
        TreeNode curr = root;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
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

