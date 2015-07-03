package com.code;

public class Load {
	public static Load singleton = new Load(); 
	public static int a = 0;
	public static int b;
	private Load() {          
		super();            
		a++;            
		b++;         
	}
	public static Load GetInstence() { 
	   return singleton;        
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Load l = Load.GetInstence();
		System.out.println(Load.a);
		System.out.println(Load.b);
	}

}
