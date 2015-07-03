package ff;

public class FindMin {
	public int findMin(int[] num) {
		for(int i=0;i<num.length;i++){
			if(num[i]<num[0]){
				return num[i];
			}
		}
		return num[0];
    }
	public int findMin2(int[] num){
		if(num.length==1){
			return num[0];
		}
		int start = 0;
		int mid = (num.length-1)/2;
		int end = num.length-1;
		while(start!=mid){
			if(num[mid]>num[end]){
				start = mid+1;
				mid = (start+end)/2;
			}else{
				end = mid;
				mid = (start+end)/2;
			}
		}
		return num[mid]<num[end]?num[mid]:num[end];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
