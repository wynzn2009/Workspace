package ff;

import java.util.LinkedList;
import java.util.Queue;

public class Connect1 {
	public void connect(TreeLinkNode root) {
		if(root==null){
			return;
		}
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		TreeLinkNode a = root;
		queue.add(root);
		while(!queue.isEmpty()){
			Queue<TreeLinkNode> queue1 = new LinkedList<TreeLinkNode>();
			while(!queue.isEmpty()){
				a = queue.poll();
				a.next = queue.peek();
				if(a.left!=null){
					queue1.add(a.left);
				}
				if(a.right!=null){
					queue1.add(a.right);
				}
			}
			queue = queue1;
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
