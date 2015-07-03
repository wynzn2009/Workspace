package com.ffTest;

class AError extends Exception{
	public AError(){
		System.out.println("This is A");
	}
}
public class RuntimeErrorTest {
	private static int result = 0;
	public static int test(int a){
		switch (a) {
		case 1:
			result = a+result;
			break;
		case 2:
			result = a+result;
			break;
		case 3:
			result = a+result;
			break;

		default:
			result = -1;
			break;
		}
		return result;
	}
	public int getResult(){
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimeErrorTest a = new RuntimeErrorTest();
		System.out.println(RuntimeErrorTest.test(1));
		System.out.println(RuntimeErrorTest.test(2));
		System.out.println(RuntimeErrorTest.test(3));
	}

}
