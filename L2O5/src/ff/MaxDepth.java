package ff;

public class MaxDepth {
	public int maxDepth(TreeNode root){
		if(root==null){
			return 0;
		}
		int a = maxDepth(root.left);
		int b = maxDepth(root.right);
		if(a>b){
			return a+1;
		}else{
			return b+1;
		}
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
