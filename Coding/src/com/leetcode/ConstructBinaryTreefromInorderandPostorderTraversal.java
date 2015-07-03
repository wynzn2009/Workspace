package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(postorder.length!=inorder.length){
        	return null;
        }
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i], i);
		}
		return findRoot(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
    }
	public TreeNode findRoot(int[] post,int pstart,int pend,int[] in,int istart,int iend,Map<Integer,Integer> map){
		if(pstart>pend||istart>iend){
			return null;
		}
		TreeNode root = new TreeNode(post[pend]);
		int index = map.get(post[pend]);
		int leftLength = index-istart;
		int rightLength = iend-index;
		root.left = findRoot(post,pstart,pstart+leftLength-1,in,istart,index-1,map);
		root.right = findRoot(post,pend-rightLength,pend-1,in,index+1,iend,map);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
