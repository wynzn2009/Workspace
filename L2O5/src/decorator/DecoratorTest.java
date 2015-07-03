package decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourcable source = new Source();  
		
        // 装饰类对象   
        Sourcable obj = new Decorator1(new Decorator2(source));  
        obj.operation(); 
	}

}
