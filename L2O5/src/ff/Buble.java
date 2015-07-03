package ff;

public class Buble {
	public static int sort(int start, int end,int[] a){
		int newend = end;
		int temp = a[start];
		for(int i=start; i<end-1;i++){
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
	public static int rsort(int start, int end,int[] a){
		int newstart = start;
		int temp = a[end];
		for(int i=end; i>start+1;i--){
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
		// TODO Auto-generated method stub
		
		
		int[] a = {9,5,3,7,6,1,0,4,2,8};
		int start = 0;
		int end = a.length;
		while(start!=end){
			end = Buble.sort(start, end, a);
			start = Buble.rsort(start, end, a);
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
}
