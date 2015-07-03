package com.leetcode;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        if(strs==null||strs.length==0){
        	return sb.toString();
        }
        if(strs.length==1){
        	return strs[0];
        }
        if(strs[0].equals("")){
        	return sb.toString();
        }
        int index = strs[0].length();
        int count = 0;
        a:
        while(true){
        	for(int i=1;i<strs.length;i++){
        		if(count>=index||strs[i].length()<=count||strs[i].charAt(count)!=strs[0].charAt(count)){
        			break a;
        		}
        	}
        	sb.append(strs[0].charAt(count));
        	count++;
        }
		return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"aa","a"};
		LongestCommonPrefix.longestCommonPrefix(strs);
	}

}
