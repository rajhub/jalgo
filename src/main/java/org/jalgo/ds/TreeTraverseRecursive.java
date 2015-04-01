package org.jalgo.ds;

public class TreeTraverseRecursive {

    public static int height(TreeNode root) {
        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // depth first - data, left, right
    public static void preOrderRecursive(TreeNode root) {
        if (root == null)
            return;

        System.out.println(root.value);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
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
