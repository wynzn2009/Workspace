package ff;

public class NumTrees {
	public static int numTrees(int n) {
        int sum = 0;
		int t = 0;
		if(n==0||n==1){
			return 1;
		}else if(n%2==0){
			for(int i=0;i<n/2;i++){
				sum = sum + numTrees(i)*numTrees(n-1-i);
			}
			sum = sum*2;
		}else{
			for(int i=0;i<n/2;i++){
				sum = sum + numTrees(i)*numTrees(n-1-i);
			}
			sum = sum*2;
			t = numTrees(n/2);
			sum = sum + t*t;
		}
		return sum;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = NumTrees.numTrees(9);
		System.out.println(t);
	}

}
