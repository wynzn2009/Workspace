package com.leetcode;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		if(n<=0){
			return 0;
		}
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<a.length;i++){
        	for(int j=0;j<i;j++){
        		a[i] = a[i] + a[j]*a[i-j-1];
        	}
        }
        return a[n];
    }
	public int numTrees1(int n) {
		if(n<=0){
			return 0;
		}
		
        int[] a = new int[n+1];
        
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<a.length;i++){
        	for(int j=0;j<i;j++){
        		a[i] = a[i] + a[j]*a[i-j-1];
        	}
        }
        return a[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
