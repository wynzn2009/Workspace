package ff;
public class TestAandB {
	public static int sort(int start, int end,long[] a){
		int newend = start;
		long temp = a[start];
		for(int i=start; i<end;i++){
			if(temp>=a[i+1]){
				temp = a[i+1];
			}else{
				a[i] = a[i+1];
				a[i+1] = temp;
				newend = i;
			}
		}
		return newend;
	}
	public static int rsort(int start, int end,long[] a){
		int newstart = end;
		long temp = a[end];
		for(int i=end;i>start;i--){
			if(temp<=a[i-1]){
				temp = a[i-1];
			}else{
				a[i] = a[i-1];
				a[i-1] = temp;
				newstart = i;
			}
		}
		return newstart;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean kk = !true;
		System.out.println(kk);
	}
}
