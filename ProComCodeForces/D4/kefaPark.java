import java.util.*;
public class kefaPark {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeNode[] tree = new TreeNode[n];
		boolean cat;
		//int[][] ans = new ans[n][n];
		//Arrays.fill(ans, -1);
		for (int i = 0;i<n ;i++ ) {
			if (sc.nextInt() == 1) {
				cat = true;
			}else{
				cat = false;
			}
			tree[i] = new TreeNode(cat);
			//cat[i] = sc.nextInt();
			//int x = sc.nextInt();
			//int y = sc.nextInt();
			//ans[x-1][y-1] = 0;
		}
		for (int i = 0;i<n-1 ;i++ ) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			tree[x].child.add(tree[y]);
			tree[y].child.add(tree[x]);
		}
		int ans = restaurant(tree[0],0,m,null);
		System.out.println(""+ans);

			/*if (cat[i] == 1) {
				cat[i] = m = m-1;
			}else{
				cat[i] = m;
			}
			
		}*/

	}
	public static class TreeNode{
		boolean cat;
		HashSet<TreeNode> child;

		public TreeNode(boolean cat){
			this.cat = cat;
			this.child = new HashSet<TreeNode>();
		}
		public boolean getCat(){
			return cat;
		}
		/*public HashSet<TreeNode> getChild(){
			return child;
		}
		public void setChild(HashSet<TreeNode> child){
			this.child = child;
		}*/

	}
	public static int restaurant(TreeNode root, int count, int m, TreeNode parent){
	
		if (root == null) {
			return 0;
		}
		if (parent != null) {
			root.child.remove(parent);			
		}
		if (root.cat) {
				count = count+1;
		}else{
				count = 0;
		}
		if (count>m) {
			return 0;	
		}
		if (root.child.size() == 0) {
			return 1;
		}
		int ans = 0;
		for (TreeNode ch: root.child) {
			ans = ans+restaurant(ch,count,m,root);
		}
		return ans;

	}
}