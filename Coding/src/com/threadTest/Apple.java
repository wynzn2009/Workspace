package com.threadTest;

import java.awt.List;
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Apple {
	private volatile static int count = 0;
	public static int getCount() {
		return count;
	}
	
	private int in(){
		return 0;
	}

	public static void setCount(int count) {
		Apple.count = count;
	}

	public synchronized static void inc(){
		count++;
		System.out.println("++"+count);
	}
	public synchronized static void dec(){
		count--;
		System.out.println("--"+count);
	}
	public Integer k(Integer n){
		n = new Integer(8);
		return n;
	}
	public void l(ArrayList<Integer> list){
		list = new ArrayList<Integer>();
		list.add(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a = {"张娜","汪杨","刘佳","宇宁","再来"};
		int n = 1;
		while(n-->0){
			System.out.println(a[(int) (5*Math.random())]);
		}
		App aq = new App(4);
		int r = aq.in();
		NumberFormat num = NumberFormat.getCurrencyInstance();
		Integer t = 0;
		aq.k(t);
		System.out.println(t);
		ArrayList<Integer> list = new ArrayList<Integer>();
		aq.l(list);
		System.out.println(list.size());
		out.print(123);
	}
}
