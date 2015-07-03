package ff;

import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] num, int target) {
        if(num==null||num.length<3){
        	return Integer.MIN_VALUE;
        }
		Arrays.sort(num);
		int diff = num[0]+num[1]+num[2]-target;
		for(int i=0;i<num.length-2;i++){
			int cur = twoSumClosest(num, target-num[i], i+1);
			if(Math.abs(cur)<Math.abs(diff)){
				diff = cur;
			}
		}
		return diff+target;
    }
	
	
	private static int twoSumClosest(int[] num,int target,int start){
		int diff = num[start]+num[start+1] - target;
		int end = num.length-1;
		while(start<end){
			if(num[start]+num[end]==target){
				return 0;
			}
			int differ = num[start]+num[end] - target;
			if(Math.abs(differ)<Math.abs(diff)){
				diff = differ;
			}
			if(num[start]+num[end]<target){
				start++;
			}else{
				end--;
			}
		}
		return diff;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {0,2,1,-3};
		ThreeSumClosest.threeSumClosest(num, 1);
	}

}
