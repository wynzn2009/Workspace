package com.ffTest;

import java.util.Arrays;

public class Q1 {
	public static int solution(int[] A){
		if(A==null){
			return 0;
		}
		if(A.length==1){
			return A[0];
		}
		int i = A.length;
		int sum = 0;
		while(i>1){
			Arrays.sort(A);
			int t = A[0]+A[1];
			sum = sum +t;
			A[0] = t;
			A[1] = Integer.MAX_VALUE;
			i--;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {100,1000,250,750};
		System.out.print(Q1.solution(A));
		
	}

}
