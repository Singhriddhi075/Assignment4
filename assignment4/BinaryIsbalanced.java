package assignment4;

import java.util.Scanner;

public class BinaryIsbalanced {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryIsbalanced m = new BinaryIsbalanced();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
    }
    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }
        private Node root;
        private int size;
        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }
        public Node takeInput(Node parent, boolean ilc) {
            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;
            // left
            boolean hlc = scn.nextBoolean();
            if (hlc) {
                child.left = this.takeInput(child, true);
            }
            // right
            boolean hrc = scn.nextBoolean();
            if (hrc) {
                child.right = this.takeInput(child, false);
            }
            // return
            return child;
        }
        public boolean isBalanced() {
            return this.isBalanced(this.root).isBalanced;
        }
        private BalancedPair isBalanced(Node node) {
        if (node == null) {
            return new BalancedPair();
        }
        BalancedPair bp = new BalancedPair();
        BalancedPair lp = isBalanced(node.left);
        BalancedPair rp = isBalanced(node.right);
        int bf = Math.abs(lp.height - rp.height);
        bp.height = Math.max(lp.height,rp.height)+1;
        if (bf<=1) {
            bp.isBalanced = true;
        } else
            bp.isBalanced = false;
        return bp;
    }
        private class BalancedPair {
            int height;
            boolean isBalanced;
        }
    }
} 