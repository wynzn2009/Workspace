package com.leetcode;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1;
        int b = n-1;
        int c = m+n-1;
        if(nums1==null||nums2==null){
        	return;
        }
        while(b>=0&&a>=0){
        	if(nums1[a]>=nums2[b]){
        		nums1[c] = nums1[a];
        		c--;
        		a--;
        	}else{
        		nums1[c] = nums2[b];
        		c--;
        		b--;
        	}
        }
        while(b>=0){
        	nums1[c] = nums2[b];
        	c--;
        	b--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
