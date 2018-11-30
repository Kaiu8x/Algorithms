import java.util.*;

public class TwoButtons {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int flag = 0;

		int res = 0;
		int temp = 0;
		int count = 0;

		Map<Integer,List<Integer>> hashmap = new HashMap<>();
		//Tree<Integer> myTree = new Tree<>(n);
		//Map<Integer,Node<T>> set = new HashMap<>();

		//Node<Integer> tempNode = myTree.root;
		//Node<Integer> xNode = new Node<>();

		while(flag == 0){
			if(n>=m) {
				res = n-m;
				flag = 1;
			} else {
				res = searchDFS(n, m, hashmap);

				flag = 1;
				/*if(temp>=1){
					xNode = Node(temp-1,tempNode);
					tempNode.addNode(xNode);
				}
				if(temp*2<=m) {
					xNode = Node(temp*2,tempNode);
					tempNode.addNode(xNode);
				}

				if(temp-1 == m || temp*2 == m) {
					res = count;
				}*/

			}
		}
		System.out.println(res);
	}

	public static int searchDFS(int n, int m, Map<Integer,List<Integer>> hashmap) {
		Stack<Integer> stack = new Stack<>();
		stack.push(n);
		int l= 0;
		int r= 0;
		int temp = 0;
		int count = 0;
		int count2 = 0;
		//int res = 0;
		int flag = 0;
		int flag2 = 0;
		List<Integer> templist = new ArrayList<>();
		while(!stack.isEmpty()) {
			System.out.println(count);
			System.out.println(count2);
			temp = stack.pop();
			if(temp-1 == m || temp*2 == m){
				stack.clear();
				count++;
				if(count2 < count && count2 != 0) {
					flag2 = 1;
				}
				break;
			}
			if(temp*2 > m) {
				count2 += count+temp*2-m;
				flag = 1 ;
			}

			if(!hashmap.containsKey(temp-1) && temp>= 1) {
				l = temp-1;
				stack.push(temp-1);
				//searchDFS(temp-1);
			}
			if(!hashmap.containsKey(temp*2) && temp*2 < m && flag == 0 ){
				r = temp*2;
				stack.push(temp*2);
				//searchDFS(temp*2);
			}
			templist.add(l);
			templist.add(r);
			templist.clear();
			hashmap.put(temp,templist);
			count ++;
			//count2 ++;
			System.out.println(count);
			System.out.println(count2);
			System.out.println();
		}
		if(flag2 == 0) {
			return count;
		} else {
			return count2;
		}
	}
	/*
	  void searchDFS(Node root) {
	    if(root == null)
	    return;
	    root.visited = true;
	    for each(Node n in root.children) {
	      if(n.visited == false) {
	        searchDFS(n);
	      }
	    }
	  }
	  */

	/*public class Tree<T> {
	    public Node<T> root;

	    public Tree(T rootData) {
	        root = new Node<T>();
	        root.data = rootData;
	        root.children = new ArrayList<Node<T>>();
	    }

	    public static class Node<T> {
	        private T data;
	        private Node<T> parent;
	        private List<Node<T>> children;

	        public Node(T nodeData, Node<T> parent) {
	        	this.data = nodeData;
	        	this.parent = parent;
	        }

	        public void addNode(Node<T> n) {
	        	this.children.add(n);
	        }
	    }
	}*/
}