/*
	Check if a tree is a Binary Search Tree BST.
*/

//Recursive method
class IsBST {

	public static void main(String[] args) {
		
	}

	public static boolean isBST(Node root) {
		return isBSTRec(root, Integer.MIN_VALUE,  Integer.MAX_VALUE);
	}

	public static boolean isBSTRec(Node node, int min, int max) {
		if (node == null)
			return true;

		if(node.data < min || node.data > max)
			return false;

		return (isBSTRec(node.left, min, node.data-1) && isBSTRec(node.right, node.data+1, max))
	}
}

class Node { 
    int data; 
    Node left, right; 
  
    public Node(int item) { 
        data = item; 
        left = right = null; 
    } 
}


//Using in-order Traversal
