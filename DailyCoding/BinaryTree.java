import java.util.*;

class Node {
	int value;
	Node left, right;

	public Node(int value) {
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
			System.out.printf("%d ",node.value); //visit(node)
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
			System.out.printf("%d ",node.value);//visit(node)
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
			System.out.printf("%d ",node.value);//visit(node)
		}
	}

	void printPostOrder() {
		printPostOrder(this.root);
	}


	public static void main(String[] args) {
		BinaryTree bnTree = new BinaryTree();
		Node nd = new Node(20);
		nd.left = new Node(3);
		nd.right = new Node(7);
		nd.left.left = new Node(9);
		nd.left.right = new Node(15);

		bnTree.root = nd;

		bnTree.printInOrder();
	}
}








