package ff;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int A[], int B[]) {
        int p = (A.length+B.length-1)/2;
        boolean flag = (A.length+B.length)%2==1?false:true;
        int i = 0;
        int j = 0;
        double result = 0;
        double result1 = 0;
		while(p>=0){
			if(i==A.length){
				result = B[j+p];
				try{
					result1 = B[j+p+1];
				}catch(Exception e){
					return result;
				}
				break;
			}else if(j==B.length){
				result = A[i+p];
				try{
					result1 = A[i+p+1];
				}catch(Exception e){
					return result;
				}
				break;
			}else{
				if(A[i]<B[j]){
					if(p==0){
						result = A[i];
						if(i==A.length-1){
							result1 = B[j];
						}else{
							result1 = A[i+1]<B[j]?A[i+1]:B[j];
						}
					}
					i++;
				}else{
					if(p==0){
						result = B[j];
						if(j==B.length-1){
							result1 = A[i];
						}else{
							result1 = A[i]<B[j+1]?A[i]:B[j+1];
						}
					}
					j++;
				}
			}
			p--;
		}
		if(flag){
			return (result+result1)/2.0;
		}else{
			return result;
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={};
		int[] B={2,3};
		FindMedianSortedArrays.findMedianSortedArrays(A, B);
	}

}
