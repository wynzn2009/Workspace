package com.threadTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exe extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService e = Executors.newCachedThreadPool();
		Thread t1 = new Thread(){
			public void run(){
				try{
					while(true){
						if(Apple.getCount()<5){
							Apple.inc();
							TimeUnit.MILLISECONDS.sleep((long) (1000*Math.random()));
						}
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				try{
					while(true){
						if(Apple.getCount()>0){
							Apple.dec();;
							TimeUnit.MILLISECONDS.sleep((long) (1000*Math.random()));
						}
					}
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		e.execute(t1);
		e.execute(t2);
		TimeUnit.SECONDS.sleep(5);
		e.shutdownNow();
	}

}
