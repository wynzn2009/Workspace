package ff;

import java.util.ArrayList;
import java.util.List;

public class Permute {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(num==null){
			return null;
		}
		if(num.length==1){
			List<Integer> a = new ArrayList<Integer>();
			a.add(num[0]);
			list.add(a);
		}else{
			int[] num1 = new int[num.length-1];
			for(int i=0;i<num1.length;i++){
				num1[i] = num[i];
			}
			List<List<Integer>> list2 = permute(num1);
			for(List<Integer> t : list2){
				int size = t.size();
				for (int j = 0; j<=size; j++) {
					List<Integer> w = new ArrayList<Integer>();
					w.addAll(t);
					w.add(j, num[num.length-1]);
					list.add(w);
				}
			}
		}
		return list;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
