package ff;

public class MaxArea {
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int multi = 0;
        while(left<right){
        	int a = Math.min(height[left], height[right]);
        	multi = Math.max(multi, a*(right-left));
        	if(height[left]>height[right]){
        		right--;
        	}else{
        		left++;
        	}
        }
		return multi;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
