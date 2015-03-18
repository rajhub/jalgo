package org.jalgo.ds;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree {

    public static int height(TreeNode root) {
        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // breadth first traversal
    public static void levelOrder(TreeNode root) {
        java.util.Queue<TreeNode> queue = new ConcurrentLinkedQueue<TreeNode>();

        if (root == null)
            return;

        queue.add(root);

        while(queue.peek()!= null) {
            TreeNode node = queue.poll();
            System.out.println(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return;
    }

    // depth first - data, left, right
    public static void preOrder(TreeNode root) {
        if (root == null)
            return;

        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    // depth first - left, data, right
    public static void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    // depth first - left, right, data
    public static void postOrder(TreeNode root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }

}
