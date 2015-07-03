package ff;


public class Rotate {
	public static void rotate(int[] nums, int k) {
		int[] num = new int[nums.length];
		for(int i=0;i<num.length;i++){
			num[(i+k)%num.length] = nums[i];
		}
		for(int t=0;t<num.length;t++){
			nums[t] = num[t];
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2};
		int k = 1;
		Rotate.rotate(nums, k);
	}

}
