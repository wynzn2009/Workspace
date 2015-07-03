package ff;

public class Sqrt {
	public static int sqrt(int x) {
		double t = x/5.0;
		long k = (long)t;
		boolean s = false;
		boolean ss = false;
		while(!(s&&ss)){
			t = (t+(double)x/t)/2;
			k = (long)t;
			s = k*k<=x;
			ss = (k+1)*(k+1)>=x;
		}
		return (int)k;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt.sqrt(2147395600);
	}

}
