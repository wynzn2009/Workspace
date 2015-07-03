
public class Stopwatch {
	private final long start;
	public Stopwatch(){
		start = System.currentTimeMillis();
	}
	public double elapsedTime(){
		long now = System.currentTimeMillis();
		return (now-start);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
