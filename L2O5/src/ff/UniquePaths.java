package ff;

public class UniquePaths {
	public static int uniquePaths(int m, int n) {
		long step = 1;
		int sum = m-1+n-1;
		int root = m>n?m-1:n-1;
		for(int i=sum,j=1;i>root;i--,j++){
			step *= i;
			step /= j;
		}
        return (int)step;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePaths.uniquePaths(5, 5);
	}

}
