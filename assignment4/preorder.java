package assignment4;

import java.util.Scanner;

public class preorder {
	static int i = 0;

	class Node {
		int data;
		Node left, right;

		Node(int pre) {
			data = pre;
			left = right = null;
		}
	}

	Node root;
	int preindex = 0;

	Node buildTree(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (ilo > ihi)
			return null;
		Node nn;
		nn = new Node(pre[plo]);
		int k = 1;
		for(int i=ilo;i<=ihi;i++)
			if(in[i]==pre[plo])
				k=i;
		nn.left = buildTree(pre, plo + 1, plo + k - ilo, in, ilo, k - 1);
		nn.right = buildTree(pre, phi - ihi + k + 1, phi, in, k + 1, ihi);
		return nn;
	}

	public void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += "END";
		}
		str += "=>" + node.data + "<=";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += "END";
		}
		System.out.println(str);
		this.display(node.left);
		this.display(node.right);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		preorder tree = new preorder();
		int m = scn.nextInt();
		int[] pre = new int[m];
		for (int i = 0; i < m; i++) {
			pre[i] = scn.nextInt();
		}
		int n = scn.nextInt();
		int[] in = new int[n];
		for (int i = 0; i < n; i++) {
			in[i] = scn.nextInt();
		}
		int len = in.length;
		Node root = tree.buildTree(pre, 0, pre.length - 1, in, 0, pre.length - 1);
		tree.display(root);

	}

}
