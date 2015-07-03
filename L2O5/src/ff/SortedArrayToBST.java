package ff;

public class SortedArrayToBST {
	/**
	 * Definition for binary tree
	 */
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	public TreeNode sortedArrayToBST(int[] num) {
		if(num.length<1){
			return null;
		}
        TreeNode a = new TreeNode(num[num.length/2]);
        int[] temp = new int[num.length/2];
        int[] temp1 = new int[(num.length-1)/2];
        for(int i=0;i<temp.length;i++){
        	temp[i] = num[i];
        }
        for(int j=0;j<temp1.length;j++){
        	temp1[j] = num[temp.length+1+j];
        }
        a.left = sortedArrayToBST(temp);
        a.right = sortedArrayToBST(temp1);
        return a;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num = {3,5,8};
		SortedArrayToBST t = new SortedArrayToBST();
		t.sortedArrayToBST(num);
	}

}
