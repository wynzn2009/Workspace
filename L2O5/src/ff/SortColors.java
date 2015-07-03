package ff;

public class SortColors {
	public static void sortColors(int[] A) {
        int a = -100;
        int b = A.length-1;
        for(int i=0;i<b+1;i++){
        	if(A[i]==2){
        		if(i==b){
        			continue;
        		}
        		A[b] = A[i]^A[b];
        		A[i] = A[i]^A[b];
        		A[b] = A[i]^A[b];
        		i--;
        		b--;
        		continue;
        	}
        	if(A[i]==0){
        		if(a>=0){
        			A[a] = A[i]^A[a];
        			A[i] = A[i]^A[a];
        			A[a] = A[i]^A[a];
        			a++;
        		}
        		continue;
        	}
        	if(A[i]==1&&a<0){
        		a = i;
        		continue;
        	}
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2};
		SortColors.sortColors(A);
	}

}
