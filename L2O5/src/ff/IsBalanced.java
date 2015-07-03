package ff;

public class IsBalanced {
	public boolean isBalanced(TreeNode root) {
        if(root==null){
        	return true;
        }
        int l = 0;
        int r = 0;
        if(root.left!=null){
        	if(!this.isBalanced(root.left)){
        		return false;
        	}
        	l = root.left.val+1;
        }
        if(root.right!=null){
        	if(!this.isBalanced(root.right)){
        		return false;
        	}
        	r = root.right.val+1;
        }
        root.val = l>r?l:r;
        if(Math.abs(l-r)<=1){
        	return true;
        }else{
        	return false;
        }
    }
	/**
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBalanced1(TreeNode root) {
		if(this.getHeight(root)==-1){
			return false;
		}else{
			return true;
		}
    }
	public int getHeight(TreeNode root){
		if(root==null){
			return 0;
		}
		int left = this.getHeight(root.left);
		if(left==-1){
			return -1;
		}else{
			left = left + 1;
		}
		int right = this.getHeight(root.right);
		if(right==-1){
			return -1;
		}else{
			right = right + 1;
		}
		if(Math.abs(left-right)>1){
			return -1;
		}else{
			return Math.max(right, left);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
