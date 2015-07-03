package com.leetcode;

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
        	return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
        	int index = (left+right)/2;
        	if(target==nums[index]){
        		return index;
        	}
        	if(nums[index]<nums[right]){
        		if(target>nums[index]&&target<=nums[right]){
        			left = index+1;
        		}else{
        			right = index-1;
        		}
        	}else{
        		if(target<nums[index]&&target>=nums[left]){
        			right = index-1;
        		}else{
        			left = index+1;
        		}
        	}
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
