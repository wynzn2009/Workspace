package com.leetcode;

import java.util.ArrayList;

public class MinStack {
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> minlist = new ArrayList<Integer>();
	public void push(int x) {
        if(list.isEmpty()||x<=minlist.get(minlist.size()-1)){
        	list.add(x);
        	minlist.add(x);
        }else{
        	list.add(x);
        }
    }

    public void pop() {
        if(list.isEmpty()){
        	return;
        }
        if(list.get(list.size()-1).equals(minlist.get(minlist.size()-1))){
        	minlist.remove(minlist.size()-1);
        }
        list.remove(list.size()-1);
    }

    public int top() {
        if(list.isEmpty()){
        	return -1;
        }else{
        	return list.get(list.size()-1);
        }
    }

    public int getMin() {
        if(minlist.isEmpty()){
        	return -1;
        }else{
        	return minlist.get(minlist.size()-1);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack a = new MinStack();
		a.push(512);
		a.push(-1024);
		a.push(-1024);
		a.push(512);
		a.pop();
		a.getMin();
		a.pop();
		a.getMin();
		a.pop();
		a.getMin();
		a=null;
	}

}
