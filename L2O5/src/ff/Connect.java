package ff;

public class Connect {
	public void connect(TreeLinkNode root) {
		if(root==null){
			return;
		}
		if(null!=root.left){
			root.left.next = root.right;
		}
		if(null!=root.right&&null!=root.next){
			root.right.next = root.next.left;
		}
		connect(root.left);
		connect(root.right);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
