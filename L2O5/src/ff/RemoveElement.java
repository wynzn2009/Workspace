package ff;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        int re = A.length;
        for(int i=0;i<re;i++){
        	if(A[i]==elem){
        		A[i]=A[re-1];
        		re--;
        		i--;
        	}
        }
        return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
