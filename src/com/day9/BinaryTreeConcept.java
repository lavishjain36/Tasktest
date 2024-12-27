package com.day9;

import java.util.Scanner;

class Node{
	int data;
	Node left,right;
	
	Node(int value){
		data=value;
		left=right=null;
	}
}

class BinaryTree{
	Node root;
	
	public BinaryTree() {
		root=null;
	}

	//insert
	public Node insert(Node root, int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		
		//insert ->left part or right part of tree
		if(data<root.data) {
			root.left=insert(root.left,data);//insert-left subtrr
		}else if(data>root.data) {
			root.right=insert(root.right, data);//insert-right subtree
		}
		return root;
	}

	//inorder->Left-root->right
	public void inorder(Node root) {
		if(root==null) return;//nothing to return
		
		inorder(root.left);//left->recursively
		System.out.print(root.data+ " ");//data of the root-parent or root
		inorder(root.right);//right
	}
	//preorder->root->left->right->25 should be in first place

	public void preorder(Node root) {
		if(root==null) return;
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}

	//postorder->left->right->root->25 should be in last place
	public void postorder(Node root) {
		if(root==null) return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+ " ");
	}
}
public class BinaryTreeConcept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTree tree=new BinaryTree();
		
		System.out.println("Enter the nodes..");
		int noofnodes=sc.nextInt();
		for(int i=0;i<noofnodes;i++) {
			int value=sc.nextInt();
			tree.root=tree.insert(tree.root,value);
		}
	
		System.out.print("Inorder Traversal");
		tree.inorder(tree.root);
		
		System.out.print("Preorder Traversal");
		tree.preorder(tree.root);
		
		System.out.print("PostOrder Traversal");
		tree.postorder(tree.root);
	}

}
