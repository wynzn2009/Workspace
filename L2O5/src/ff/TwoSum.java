package ff;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] re = new int[2];
        for(int i=0;i<numbers.length;i++){
        	map.put(numbers[i], i);
        }
		for(int j=0;j<numbers.length;j++){
			int t = numbers[j];
			Integer k = map.get(target-t);
			if(k!=null&&k!=j){
				re[0] = j+1;
				re[1] = k+1;
				break;
			}
		}
		return re;
    }
	public int[] twoSum1(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] re = new int[2];
        for(int i=0;i<numbers.length;i++){
        	if(map.containsKey(target-numbers[i])){
        		re[0] = map.get(target-numbers[i])+1;
        		re[1] = i+1;
        		break;
        	}else{
        		map.put(numbers[i], i);
        	}
        }
		return re;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
