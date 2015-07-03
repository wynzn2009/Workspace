package java1;

public class Apple extends Thread{
	private static int number = 0;
	private final int MaxApple = 5;
	private boolean type;
	public Apple(boolean type){
		this.type = type;
	}
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		Apple.number = number;
	}
	public void go(){
		synchronized(this){
			if(!this.type){
				this.getApple();
			}else{
				this.addApple();
			}
		}
	}
	public void getApple(){
		synchronized(this){
			if(number>0){
				System.out.println(Thread.currentThread().getName()+"get"+number);
				number--;
			}
		}
	}
	public void addApple(){
		synchronized(this){
			if(number<MaxApple){
				System.out.println(Thread.currentThread().getName()+"add"+number);
				number++;
			}
		}
	}
	public void run(){
		while(true){
			this.go();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple(true);
		Apple a2 = new Apple(false);
		a1.start();
		a2.start();
	}

}
