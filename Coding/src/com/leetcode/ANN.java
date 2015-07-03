package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANN {
	private List<Integer> list = new ArrayList<Integer>();
	private Integer MaxNum = 8;
	private boolean[] flag = new boolean[MaxNum];
	private int[] num = {1,2,3,4,5,6,7,8,9};
	public ANN(){
		Arrays.fill(flag, false);
	}
	private int count = 1;
	private long time = System.nanoTime();
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public void getANN(int n){
		if(n==MaxNum){
			System.out.println(list.toString()+"..Answer:"+count++);
			System.out.println(System.nanoTime()-time);
			this.setTime(System.nanoTime());
			return;
		}else{
			for(int i=0;i<MaxNum;i++){
				if(!flag[i]){
					list.add(num[i]);
					flag[i]=true;
					getANN(n+1);
					list.remove(list.size()-1);
					flag[i]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ANN ann = new ANN();
		ann.getANN(0);
	}

}
