package java1;

public class Apples {
	public int count = 0;
	public final int MaxCount = 5;
	
	public synchronized void go(boolean fire) throws InterruptedException{
			if(fire){
				if(this.count>0){
					this.count--;
					System.out.println("get"+this.count);
					notifyAll();
				}
			}else{
				if(this.count<this.MaxCount){
					this.count++;
					System.out.println("put"+this.count);
					notifyAll();
				}
			}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
