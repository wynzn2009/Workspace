package com.leetcode;

import java.util.Arrays;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
        	return "";
        }
        boolean flag = false;
        String pal = "";
        int length = 0;
        for(int i=0;i<s.length();i++){
        	int left = i;
        	int right = i;
        	if(flag){
        		left = i-1;
        		i--;
        	}
        	flag = !flag;
        	String ss = help(s,left,right);
        	if(ss.length()>length){
        		length = ss.length();
        		pal = ss;
        	}
        }
        return pal;
    }
	private String help(String s,int left,int right){
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1,right);
	}
	
	public String longestPalindrome1(String s) {
		if(s==null||s.length()==0){
			return "";
		}
		int length=0;
		String a = "";
		boolean[][] flag = new boolean[s.length()][s.length()];
		for(int i=0;i<s.length();i++){
			for(int j=i;j>=0;j--){
				if(s.charAt(i)==s.charAt(j)&&(i-j<3||flag[j+1][i-1])){
					flag[j][i]=true;
					String ss = s.substring(j,i+1);
					if(ss.length()>length){
						length = ss.length();
						a = ss;
					}
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring a = new LongestPalindromicSubstring();
		System.out.println(a.longestPalindrome1("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeegggggggggggggggggggggggggggggggggggggggggggggggggggggg"));
	}

}
