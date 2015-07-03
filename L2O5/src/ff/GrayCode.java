package ff;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static List<Integer> grayCode(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		if(n==0){
			return list;
		}
		list.add(1);
        int i = 2;
		while(i<=n){
			int k = 1<<i-1;
        	for(int j=0;j<k;j++){
        		list.add(list.get(k-1-j)|k);
        	}
        	i++;
        }
		return list;
    }
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static List<Integer> grayCode1(int n) {
		List<Integer> list = new ArrayList<Integer>();
		if(n==0){
			list.add(0);
			return list;
		}
		int size = 1<<n;
		for(int i=0;i<size;i++){
			int code = i^(i>>1);
			list.add(code);
		}
		return list;
    }
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static List<Integer> grayCode2(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		if(n==0){
			return list;
		}
		int size = 1<<n;
		for(int i=1;i<size;i++){
			int code = list.get(i-1);
			int k = 1;
			if((i&1)==1){
				code = code^1;
			}else{
				while((code&1)==0){
					code>>=1;
					k <<=1;
				}
				code = list.get(i-1)^(k<<1);
			}
			list.add(code);
		}
		return list;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode.grayCode2(4);
	}

}
