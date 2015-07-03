package ff;

public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q!=null||p!=null&&q==null){
        	return false;
        }else if(p==null&&q==null){
        	
        }else if(p.val!=q.val){
        	return false;
        }
        boolean k = isSameTree(p.left,q.left);
        boolean l = isSameTree(p.right,q.right);
        
		return k&&l?true:false;
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
