package com.leetcode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
        	return true;
        }
        return sameTree(root.left,root.right);
    }
	public boolean sameTree(TreeNode left,TreeNode right){
		if(left==null&&right==null){
			return true;
		}
		if(left==null||right==null){
			return false;
		}
		if(left.val!=right.val){
			return false;
		}
		return sameTree(left.left,right.right)&&sameTree(left.right,right.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
