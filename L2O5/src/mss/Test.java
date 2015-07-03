package mss;

public class Test implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<12;i++){
			Singleton sing = Singleton.getInstance();
			System.out.println(sing.hashCode());
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Thread a = new Thread(new Test());
		Thread b = new Thread(new Test());
		a.start();
		b.start();
		*/
	}
	
}
