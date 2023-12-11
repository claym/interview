package net.claymitchell.neetcode.trees;


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

    public static void inOrder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;

        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public static void preOrder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;

        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right, list);
    }

    public static void postOrder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;

        postOrder(root.left,list);
        postOrder(root.right, list);
        list.add(root.val);
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

