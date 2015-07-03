package ff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(num==null||num.length<3){
			return list;
		}
		Arrays.sort(num);
		for(int i=num.length-1;i>=2;i--){
			if(i<num.length-1&&num[i]==num[i+1]){
				continue;
			}
			ArrayList<ArrayList<Integer>> tip = twoSum(num, i-1, -num[i]);
			for(int j=0;j<tip.size();j++){
				tip.get(j).add(num[i]);
			}
			list.addAll(tip);
		}
		return list;
    }
	
	
	private static ArrayList<ArrayList<Integer>>twoSum(int[] sorted, int end,int target){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if(sorted==null||sorted.length<2){
			return list;
		}
		int start = 0;
		while(start<end){
			ArrayList<Integer> num = new ArrayList<Integer>();
			if(sorted[start]+sorted[end]==target){
				if(start<end&&sorted[start]==sorted[end]){
					start = end-1;
					num.add(sorted[start]);
					num.add(sorted[end]);
					list.add(num);
					break;
				}
				while(start<end&&sorted[start]==sorted[start+1]){
					start++;
				}
				while(start<end&&sorted[end]==sorted[end-1]){
					end--;
				}
				num.add(sorted[start]);
				num.add(sorted[end]);
				list.add(num);
				start++;
				end--;
			}else if(sorted[start]+sorted[end]>target){
				end--;
			}else{
				start++;
			}
		}
		return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
		ThreeSum.threeSum(num);
	}

}
