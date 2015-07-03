package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {
	public List<TreeNode> generateTrees(int n) {
        return getRoot(1, n);
    }
	public List<TreeNode> getRoot(int left,int right){
		List<TreeNode> list = new ArrayList<TreeNode>();
		if(left>right){
			list.add(null);
			return list;
		}
		for(int i=left;i<=right;i++){
			List<TreeNode> llist = getRoot(left,i-1);
			List<TreeNode> rlist = getRoot(i+1,right);
			for(int s=0;s<llist.size();s++){
				for(int t=0;t<rlist.size();t++){
					TreeNode root = new TreeNode(i);
					root.left = llist.get(s);
					root.right = rlist.get(t);
					list.add(root);
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
