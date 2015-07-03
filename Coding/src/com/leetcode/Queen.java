package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen {
	//同栏是否有皇后，1表示有
	private int[] column;
	 
	//右上至左下是否有皇后
	private int[] rup;
	 
	//左上至右下是否有皇后
	private int[] lup;
	 
	//解答
	private int[] queen;
	 
	//解答编号
	private int num;
	
	private List<String[]> list;
	public List<String[]> solveNQueens(int n) {
		list = new ArrayList();
		if(n==1){
			String[] a = {"Q"};
			list.add(a);
			return list;
		}else if(n<4){
			return list;
		}
		this.column = new int[n+1];
		this.rup = new int[2*n+1];
		this.lup = new int[2*n+1];
		this.queen = new int[n+1];
		this.num = n;
        Arrays.fill(this.column, 1);
        Arrays.fill(this.rup, 1);
        Arrays.fill(this.lup, 1);
        Arrays.fill(this.queen, 0);
        this.backtrack(1);
        
        
        
        return list;
    }
	
	
	public void backtrack(int i){
		if(i>num){
			showAnswer();
		}else{
			for(int j=1;j<=num;j++){
				if((column[j]==1)&&(rup[i+j]==1)&&(lup[i-j+num]==1)){
					queen[i]=j;
					//设定为占用
					column[j]=rup[i+j]=lup[i-j+num]=0;
					backtrack(i+1);
					column[j]=rup[i+j]=lup[i-j+num]=1;
				}
			}
		}
	}
	 
	protected void showAnswer(){
		String[] s = new String[num];
		for(int y=1;y<=num;y++){
			StringBuffer a = new StringBuffer();
			for(int x=1;x<=num;x++){
				if(queen[y]==x){
					a.append("Q");
				}else{
					a.append(".");
				}
			}
			s[y-1] = a.toString();
		}
		list.add(s);
	}
	 
	public static void main(String[]args){
		
		
		
	}

}
