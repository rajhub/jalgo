package org.jalgo.ds.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TreeTraverse {

    public static void main(String args[]) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        t4.left = t2;
        t2.left = t1;
        t2.right = t3;
        t4.right = t6;
        t6.left = t5;
        t6.right = t7;

        printTree(t4);
    }

    public static int height(TreeNode root) {
        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // breadth first traversal
    public static List levelOrder(TreeNode root) {
        java.util.Queue<TreeNode> queue = new ConcurrentLinkedQueue<TreeNode>();
        ArrayList<Object> list = new ArrayList<Object>();

        if (root == null)
            return list;

        queue.add(root);

        while(queue.peek()!= null) {
            TreeNode node = queue.poll();
            list.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return list;
    }

    // Print like a tree
    public static void printTree(TreeNode root) {
        java.util.Queue<TreeNode> queue = new ConcurrentLinkedQueue<TreeNode>();

        if (root == null)
            return;

        queue.add(root);
        queue.add(new TreeNode(null));

        while(queue.peek()!= null) {
            TreeNode node = queue.poll();
            if (node.value != null) {
                System.out.print(node.value + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            } else {
                System.out.println();
                if (queue.isEmpty()) break;
                queue.add(new TreeNode(null));
            }
        }
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
        TreeNode p = root;

        while(!stack.empty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                list.add(node.value);
                p = node.right;
            }
        }

        return list;
    }
}
