package net.claymitchell.neetcode.trees;

import java.util.*;

public class TreeNodeUtil {

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

    public static TreeNode createTree(Integer[] array) {
        if (array == null || array.length==0) {
            return null;
        }

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        Queue<Integer> integerQueue = new LinkedList<>();
        for (int i = 1; i < array.length; i++) {
            integerQueue.offer(array[i]);
        }

        TreeNode treeNode = new TreeNode(array[0]);
        treeNodeQueue.offer(treeNode);

        while (!integerQueue.isEmpty()){
            Integer leftVal = integerQueue.isEmpty() ? null : integerQueue.poll();
            Integer rightVal = integerQueue.isEmpty() ? null : integerQueue.poll();
            TreeNode current = treeNodeQueue.poll();
            if (leftVal !=null) {
                TreeNode left = new TreeNode(leftVal);
                current.left = left;
                treeNodeQueue.offer(left);
            }
            if (rightVal !=null){
                TreeNode right = new TreeNode(rightVal);
                current.right = right;
                treeNodeQueue.offer(right);
            }
        }
        return treeNode;
    }

    public static boolean pathSum(TreeNode root, int targetValue) {
        Stack<Integer> path = new Stack<>();
        return pathSum(root, targetValue, path);
    }

    private static boolean pathSum(TreeNode root, int targetValue, Stack<Integer> path) {
        if(root == null) {
            return false;
        }
        path.push(root.val);
        // see if we've got a leaf
        if(root.left == null && root.right == null) {
            int sum = path.stream().mapToInt(i -> i).sum();
            if(sum == targetValue) {
                return true;
            }
        } else if(pathSum(root.left, targetValue,path)) {
            return true;
        } else if(pathSum(root.right, targetValue,path)) {
            return true;
        }
        // this node wasn't it, go back a step
        path.pop();
        return false;
    }

    /**
     * take a root, make a list of list in their breadth first order,
     * ie [[20], [10,30], [5,15,25,35]] etc
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
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
}
