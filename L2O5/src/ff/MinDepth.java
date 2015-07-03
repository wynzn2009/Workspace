package ff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MinDepth {
	public int minDepth(TreeNode root) {
        int depth = 0;
		if(root==null){
			return depth;
		}
		List<TreeNode> row = new ArrayList<TreeNode>();
		row.add(root);
		depth++;
		while(!row.isEmpty()){
			Iterator<TreeNode> it= row.iterator();
			List<TreeNode> row1 = new ArrayList<TreeNode>();
			while(it.hasNext()){
				TreeNode aa = it.next();
				if(aa.left==null&&aa.right==null){
					return depth;
				}
				if(aa.left!=null){
					row1.add(aa.left);
				}
				if(aa.right!=null){
					row1.add(aa.right);
				}
				it.remove();
			}
			row = row1;
			depth++;
		}
        return depth;
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
