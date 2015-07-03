package ff;

public class Reverse {
	public static int reverse(int x) {
		int n = 1;
        if(x<=Integer.MIN_VALUE){
        	return 0;
        }else if(x<0){
        	n = -1;
        	x = -x;
        }
		long k = x%10;
		while(x/10!=0){
			x = x/10;
			k = k*10;
			k = k + x%10;
		}
		if(k>Integer.MAX_VALUE){
			return 0;
		}else{
			return (int) (n*k);
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = Reverse.reverse(1);
		System.out.println(k);
	}

}
