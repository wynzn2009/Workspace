package com.ffTest;

public class JoinTest{
	private volatile static int count=0;
	public synchronized static void inc(){
		count++;
	}
	public synchronized static void dec(){
		count--;
	}
	public static int getCount(){
		return count;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread a = new Thread(){
			public void run(){
				for(int i=0;i<10000;i++){
					JoinTest.inc();;
					
				}
				System.out.println(JoinTest.getCount()+"GG");
			}
		};
		Thread b = new Thread(){
			public void run(){
				for(int i=0;i<8000;i++){
					JoinTest.dec();;
				}
				System.out.println(JoinTest.getCount()+"HH");
			}
		};
		a.start();
		b.start();
		b.join();
		a.join();
	}

}
