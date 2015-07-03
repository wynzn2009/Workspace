package ff;


public class MaxSubArray {
	public int maxSubArray(int[] A) {
        int max = A[0];
        int min = A[0];
        int sum = A[0];
        for(int i=1;i<A.length;i++){
        	sum += A[i]; 
        	if(sum>max||sum - min>max){
        		max = min<0?sum-min:sum;
        	}
        	if(sum<min){
        		min = sum;
        	}
        }
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArray a = new MaxSubArray();
		int [] aa = {-2,-1};
		a.maxSubArray(aa);
	}

}
