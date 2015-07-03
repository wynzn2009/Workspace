package adapter;

public class Adapter implements Target {
	private Adaptee adapteet=null;
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		adapteet.SpecificRequest();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
