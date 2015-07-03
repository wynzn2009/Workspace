package ff;

public class FindPeakElement {
	public int findPeakElement(int[] num) {
        int left = 0;
        int right = num.length-1;
        while(left<=right){
        	if(left==right){
        		return left;
        	}
        	int mid = (left+right)/2;
        	if(num[mid]<num[mid+1]){
        		left = mid+1;
        	}else{
        		right = mid;
        	}
        }
        return left;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
