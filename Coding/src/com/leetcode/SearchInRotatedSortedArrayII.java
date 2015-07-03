package com.leetcode;

public class SearchInRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
        if(nums==null||nums.length==0){
        	return false;
        }
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
        	int index = (l+r)/2;
        	if(nums[index]==target){
        		return true;
        	}
        	if(nums[index]<nums[r]){
        		if(target>nums[index]&&target<=nums[r]){
        			l++;
        		}else{
        			r--;
        		}
        	}else if(nums[index]>nums[r]){
        		if(target<nums[index]&&target>=nums[l]){
        			r--;
        		}else{
        			l++;
        		}
        	}else{
        		r--;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
