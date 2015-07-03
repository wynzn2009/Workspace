package ff;

public class SearchInsert {
	public static int searchInsert(int[] A, int target) {
		int n = A.length-1;
        int a = 0;
        while(n-a>1){
        	if(target==A[(n-a)/2+a]){
        		return (n-a)/2+a;
        	}else if(target>A[(n-a)/2+a]){
        		a = (n-a)/2+ a +1;
        	}else{
        		n = (n-a)/2+ a - 1;
        	}
        }
        if(target<=A[a]){
        	return a;
        }else if(target>A[n]){
        	return n+1;
        }else{
            return a+1;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,4,5,6,7,8};
		int a = SearchInsert.searchInsert(A, 7);
		System.out.println(a);
	}

}
