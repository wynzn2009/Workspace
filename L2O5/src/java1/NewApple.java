package java1;

public class NewApple implements Runnable{
	private Apples a;
	private Boolean fire;
	
	public NewApple(Apples app,boolean flag){
		this.a = app;
		this.fire = flag;
	}
	public void go() throws InterruptedException{
		synchronized (a) {
			if(fire){
				if(a.count>0){
					a.count = (int) (a.count - a.count*Math.random());
					System.out.println("get"+a.count);
					notifyAll();
				}
			}else{
				if(a.count<a.MaxCount){
					a.count = (int) (a.count + (5-a.count)*Math.random());
					System.out.println("put"+a.count);
					notifyAll();
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apples aa = new Apples();
		Thread t1 = new Thread(new NewApple(aa, true));
		Thread t2 = new Thread(new NewApple(aa, false));
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				a.go(fire);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
