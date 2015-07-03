package ff;

public class RemoveDuplicates {
	public int removeDuplicates(int[] A) {
        if(A.length==0){
        	return 0;
        }
		int i = 1;
		int next = 1;
        int a = A[0];
		while(i<A.length){
			if(A[i]!=a){
				A[next] = A[i];
				a = A[next];
				next++;
			}
			i++;
		}
		return next;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
