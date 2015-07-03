package decorator;

public class Decorator2 implements Sourcable {
	private Sourcable sourcable;  
    public Decorator2(Sourcable sourcable){  
        super();  
        this.sourcable=sourcable;  
    }
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("第二个装饰器前");  
        sourcable.operation();  
        System.out.println("第二个装饰器后");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
