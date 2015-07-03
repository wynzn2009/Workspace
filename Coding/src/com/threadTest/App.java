package com.threadTest;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App extends Apple implements Comparable<App> {
	private int name;
	
	public App(int name) {
		super();
		this.name = name;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	int in(){
		return 3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a = new App(4);
		int aa = a.name;
		
	}
	public int compareTo(App o) {
		// TODO Auto-generated method stub
		if(new Random().nextBoolean()){
			return -1;
		}else{
			return 1;
		}
	}
}
