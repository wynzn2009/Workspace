package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordBreakII {
	public List<String> wordBreak(String s, Set<String> wordDict) {
		List<String> list = new ArrayList<String>();
        if(s==null||s.length()==0){
        	return list;
        }
        this.help(s, wordDict, 0, list, "");
        return list;
    }
	private void help(String s,Set<String> wordDict,int a,List<String> list,String temp){
		if(a==s.length()){
			list.add(temp);
			return;
		}
		StringBuffer str = new StringBuffer();
		for(int i=a;i<s.length();i++){
			str.append(s.charAt(i));
			if(wordDict.contains(str.toString())){
				String nTemp = temp.length()>0?(temp+" "+str.toString()):str.toString();
				this.help(s, wordDict, i+1, list, nTemp);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
