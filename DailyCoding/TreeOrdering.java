/*
This problem was asked by Google.
Given pre-order and in-order traversals of a binary tree, write a function to reconstruct
the tree.

For example, given the following preorder traversal:

[a, b, d, e, c, f, g]

And the following inorder traversal:

[d, b, e, a, f, c, g]

You should return the following tree:

    a
   / \
  b   c
 / \ / \
d  e f  g
*/
import java.util.Arrays;

public class TreeOrdering {
	static int iglob = 0;
	public static void main(String[] args) {
		//char[] preorderTraversal = {'a','b','d','e','c','f','g'};
		//char[] inorderTraversal = {'d','b','e','a','f','c','g'};

		char[] preorderTraversal = {'a','B','d','h','i','e','k','c','f','l','g','m','n'};
		char[] inorderTraversal = {'h','d','i','B','k','e','a','l','f','c','m','g','n'};

		Node nd = convertToBinaryTree(preorderTraversal,inorderTraversal);
		BinaryTree bnTree = new BinaryTree();
		bnTree.root = nd;
		System.out.print("preOrder [ ");
		bnTree.printPreOrder();
		System.out.print(" ]\n");
		System.out.print("inOrder [ ");
		bnTree.printInOrder();
		System.out.print(" ]\n");
	}

	//Recursion helper.
	public static Node convertToBinaryTree(char[] preorderTraversal, char[] inorderTraversal) {
		Node root = new Node(preorderTraversal[iglob]);
		System.out.printf("checking for %c\n", preorderTraversal[iglob]);
		int splitIndex = Arrays.binarySearch(inorderTraversal, 0, inorderTraversal.length, preorderTraversal[iglob]);
		System.out.printf(" index : %d\n ", splitIndex);
		iglob++;
		char[] leftPart = Arrays.copyOfRange(inorderTraversal, 0, splitIndex);
		System.out.print("left part: [ ");
		for (Character x: leftPart) {
			System.out.print(x+", ");
		}
		System.out.print(" ]\n");
		char[] rightPart = Arrays.copyOfRange(inorderTraversal, splitIndex+1, inorderTraversal.length);
 		System.out.print("right part: [ ");
		for (Character x: rightPart) {
			System.out.print(x+", ");
		}
		System.out.print(" ]\n");
 		root.left = convertToBinaryTreeRec(leftPart, preorderTraversal);
 		System.out.printf("left Node value: %c\n",root.left.value);
 		root.right = convertToBinaryTreeRec(rightPart, preorderTraversal);
 		System.out.printf("right Node value: %c\n",root.right.value);
 		return root;
	}

	public static Node convertToBinaryTreeRec(char[] nodeTraversal, char[] preorderTraversal) {
		Node nd = new Node(preorderTraversal[iglob]);
		iglob++;
		if(nodeTraversal.length > 1) {
			System.out.printf("checking for %c\n", nd.value);
			//int splitIndex = Arrays.binarySearch(nodeTraversal, 0, nodeTraversal.length, nd.value);
			//int splitIndex = Arrays.binarySearch(nodeTraversal, nd.value);
			int splitIndex = 100;
			for(int l = 0; l<nodeTraversal.length; l++) {
				if(nodeTraversal[l] == nd.value){
					splitIndex = l;
				}
			}
			//System.out.printf(" index : %d\n ", splitIndex);

			//System.out.print("nodeTraversal: [ ");
			//for (Character x: nodeTraversal) {
			//	System.out.print(x+", ");
			//}
			//System.out.print(" ]\n");

			char[] leftPart = Arrays.copyOfRange(nodeTraversal, 0, splitIndex);
			System.out.print("left part: [ ");
			for (Character x: leftPart) {
				System.out.print(x+", ");
			}
			System.out.print(" ]\n");
			char[] rightPart = Arrays.copyOfRange(nodeTraversal, splitIndex+1, nodeTraversal.length);
			System.out.print("right part: [ ");
			for (Character x: rightPart) {
				System.out.print(x+", ");
			}
			System.out.print(" ]\n");
			if(leftPart.length != 0) {
				nd.left = convertToBinaryTreeRec(leftPart, preorderTraversal);
				System.out.printf("left Node value %c\n", nd.left.value);
			}
			if(rightPart.length != 0) {
				nd.right = convertToBinaryTreeRec(rightPart, preorderTraversal);
 				System.out.printf("right Node value %c\n", nd.right.value);
			}
 			
		}
		return nd;
	}
}

class Node {
	char value;
	Node left, right;

	public Node(char value) {
		this.value = value;
		this.left = this.right = null;
	}
}

class BinaryTree {
	//Binary Tree root
	Node root;

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree (Node root) {
		this.root = root;
	}

	void printPreOrder(Node node) {
		if(node != null) {
			System.out.printf("%c ",node.value); //visit(node)
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}

	void printPreOrder() {
		printPreOrder(this.root);
	}

	void printInOrder(Node node) {
		if(node != null) {
			printInOrder(node.left);
			System.out.printf("%c ",node.value);//visit(node)
			printInOrder(node.right);
		}
	}

	void printInOrder() {
		printInOrder(this.root);
	}

	void printPostOrder(Node node) {
		if(node != null) {
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.printf("%c ",node.value);//visit(node)
		}
	}

	void printPostOrder() {
		printPostOrder(this.root);
	}

	/*
	public static void main(String[] args) {
		BinaryTree bnTree = new BinaryTree();
		Node nd = new Node(20);
		nd.left = new Node(3);
		nd.right = new Node(7);
		nd.left.left = new Node(9);
		nd.left.right = new Node(15);

		bnTree.root = nd;

		bnTree.printInOrder();
	}*/
}

