package com.ds.tree;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree() {
		
		root =null;
	}
	
	void printOrderLevel() {
		int h = height(root);
		for (int i=1; i<=h; i++) {
			printCurrentLevel(root,i);
		}
	}
	
	int height(Node root) {
		if(root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			if(lheight > rheight) {
				return lheight + 1;
			}else {
				return rheight+1;
			}
		}
	}
	
	void printCurrentLevel(Node root, int level) {
		if(root ==null) {
			return;
		}
		if(level == 1) {
			System.out.println(root.data + " ");
		}else if(level > 1) {
			printCurrentLevel(root.left , level-1);
			printCurrentLevel(root.right , level-1);
		}
	}
	
	
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		
		System.out.println("Level order traversal of binary tree is : ");
		tree.printOrderLevel();
		
	}

}
