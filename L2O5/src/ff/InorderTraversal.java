package ff;

import java.util.ArrayList;
import java.util.List;
public class InorderTraversal {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	public List<Integer> preorderTraversal(TreeNode root) {
	  List<Integer> list = new ArrayList<Integer>();
	  if(root==null){
	  	return list;
	  }
	  list.add(root.val);
	  list.addAll(preorderTraversal(root.left));
	  list.addAll(preorderTraversal(root.right));
	  return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
