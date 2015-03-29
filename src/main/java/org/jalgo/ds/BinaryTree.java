package org.jalgo.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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
    public static void preOrderRecursive(TreeNode root) {
        if (root == null)
            return;

        System.out.println(root.value);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    // depth first - data, left, right
    public static List preOrder(TreeNode root) {

        ArrayList<Object> list = new ArrayList<Object>();

        if (root == null)
            return list;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            list.add(node.value);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }

        return list;
    }

    // depth first - left, data, right
    public static List inOrder(TreeNode root) {

        ArrayList<Object> list = new ArrayList<Object>();

        if (root == null)
            return list;

        Stack<TreeNode> stack = new Stack<TreeNode>();

        while(!stack.empty()) {
        }

        return list;
    }

    // depth first - left, data, right
    public static void inOrderRecursive(TreeNode root) {
        if (root == null)
            return;

        inOrderRecursive(root.left);
        System.out.println(root.value);
        inOrderRecursive(root.right);
    }

    // depth first - left, right, data
    public static void postOrderRecursive(TreeNode root) {
        if (root == null)
            return;

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.println(root.value);
    }

}
