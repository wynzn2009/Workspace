package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NP{
	//private static List<Character> list = new ArrayList<Character>();
	private static List<Integer> list = new ArrayList<Integer>();
	//private static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void test(int n,int r){
		if(n==r){
			System.out.println(list.toString());
			return;
		}
		for(int i=0;i<n;i++){
			list.add(i);
			if(true){
				test(n,r+1);
			}
			list.remove(list.size()-1);
		}
	}
	public static void main(String[]args){
		NP.test(3,0);
	}
}
