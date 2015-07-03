package ff;

public class HasPathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
        	return false;
        }
		if(sum==root.val&&root.left==null&root.right==null){
			return true;
		}else{
			return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
