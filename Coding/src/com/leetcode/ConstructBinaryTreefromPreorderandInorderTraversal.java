package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length!=inorder.length){
        	return null;
        }
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<inorder.length;i++){
			map.put(inorder[i], i);
		}
		return findRoot(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    }
	
	
	public TreeNode findRoot(int[] pre,int pstart,int pend,int[] in,int istart,int iend,Map<Integer,Integer> map){
		if(pstart>pend||istart>iend){
			return null;
		}
		TreeNode root = new TreeNode(pre[pstart]);
		int index = map.get(pre[pstart]);
		int leftLength = index-istart;
		int rightLength = iend-index;
		root.left = findRoot(pre,pstart+1,pstart+1+leftLength-1,in,istart,index-1,map);
		root.right = findRoot(pre,pend-rightLength+1,pend,in,index+1,iend,map);
		System.out.print(root.val);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructBinaryTreefromPreorderandInorderTraversal a = new ConstructBinaryTreefromPreorderandInorderTraversal();
		int [] preorder = {1,2};
		int [] inorder = {2,1};
		a.buildTree(preorder, inorder);
	}

}
