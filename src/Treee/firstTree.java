package Treee;

import java.util.Scanner;

public class firstTree {
     static Scanner sc = new Scanner(System.in);
    private static TreeNode buildTree() {
        System.out.println("enter data : ");
        int val = sc.nextInt();
        if(val == -1) return null;
        TreeNode root = new TreeNode(val);
        System.out.println("enter data for left node : " + val);
        root.left = buildTree();
        System.out.println("enter data for right node : " + val);
        root.right = buildTree();
        return root;
    }
    private static void printLDR(TreeNode root) {
        if(root == null) return;
        printLDR(root.left);
        System.out.print(root.data + " ");
        printLDR(root.right);
    }
    private static void printDLR(TreeNode root) {
        if(root == null) return;
        printDLR(root.right);
        System.out.print(root.data + " ");
        printDLR(root.left);
    }
    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println("---LDR---");
        printLDR(root);
        System.out.println();
        System.out.println("---DLR---");
        printDLR(root);
//        System.out.println();
//        System.out.println("---DLR---");
//        printDlR(root);
    }


}
