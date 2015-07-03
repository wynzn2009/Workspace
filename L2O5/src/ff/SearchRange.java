package ff;

public class SearchRange {
	public static int[] searchRange(int[] A, int target) {
        int[] a = new int[2];
        a = searchRange1(A,target,0,A.length-1);
        return a;
    }
	public static int[] searchRange1(int[] A, int target,int i,int j) {
        int[] a = new int[2];
        if(A[i]>target||A[j]<target){
        	a[0] = -1;
    		a[1] = -1;
    		return a;
        }else if(A[i]==target&&A[j]==target){
        	a[0] = i;
    		a[1] = j;
        	return a;
        }else{
        	int[] t = searchRange1(A,target,i,(i+j)/2);
        	int[] s = searchRange1(A,target,(i+j)/2+1,j);
        	if(t[0]!=-1){
        		a[0] = t[0];
        		if(s[1]!=-1){
        			a[1] = s[1];
        		}else{
        			a[1] = t[1];
        		}
        	}else{
        		a[0] = s[0];
        		a[1] = s[1];
        	}
        }
        return a;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3};
		int target = 1;
		SearchRange.searchRange(A, target);
	}

}
