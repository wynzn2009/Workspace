package ff;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LevelOrder {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> a1 = new ArrayList<Integer>();
		if(root==null){
			return list;
		}
		a1.add(root.val);
		list.add(a1);
		List<TreeNode> row = new ArrayList<TreeNode>();
		row.add(root);
		while(!row.isEmpty()){
			Iterator<TreeNode> it= row.iterator();
			List<Integer> a = new ArrayList<Integer>();
			List<TreeNode> row1 = new ArrayList<TreeNode>();
			while(it.hasNext()){
				TreeNode aa = it.next();
				if(aa.left!=null){
					a.add(aa.left.val);
					row1.add(aa.left);
				}
				if(aa.right!=null){
					a.add(aa.right.val);
					row1.add(aa.right);
				}
				it.remove();
			}
			if(!a.isEmpty()){
				list.add(a);
			}
			row = row1;
		}
		return list;
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
