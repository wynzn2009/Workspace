package ms2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static String re(int[] sign,Map<Integer,ArrayList<Integer>> datamap,Map<Integer,Integer> remap,int[] datastart){
		for(int i=0;i<sign.length;i++){
			Main.getLength(sign[i], datamap, remap);
		}
		String a = "";
		for(int i=0;i<datastart.length;i++){
			int count = remap.get(datastart[i]);
			a = a + count;
			if(i != datastart.length-1){
				a = a + " ";
			}
		}
		return a;
	}
	public static void getLength(int a,Map<Integer,ArrayList<Integer>> datamap,Map<Integer,Integer> remap){
		if(datamap.containsKey(a)){
			remap.put(a, remap.get(a)+1);
			ArrayList<Integer> data22 = datamap.get(a);
			for(int i=0;i<data22.size();i++){
				Main.getLength(data22.get(i), datamap, remap);
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
    	n = in.nextInt();
    	while(n>0) {
    		int k = in.nextInt();
    		int[] datastart = new int[k];
    		int signal  = in.nextInt();
    		int[] sign = new int[signal];
    		for(int i=0;i<signal;i++){
    			sign[i] = in.nextInt();
    		}
    		Map<Integer,ArrayList<Integer>> datamap = new HashMap<Integer,ArrayList<Integer>>();
    		Map<Integer,Integer> remap = new HashMap<Integer,Integer>();
    		for(int t=0;t<k;t++){
    			datastart[t] = in.nextInt();
    			int length = in.nextInt();
    			ArrayList<Integer> data2 = new ArrayList<Integer>();
    			for(int j=0;j<length;j++){
    				data2.add(in.nextInt());
    			}
    			if(datamap.containsKey(datastart[t])){
    				datamap.get(datastart[t]).addAll(data2);
    			}else{
    				datamap.put(datastart[t], data2);
    			}
    			remap.put(datastart[t], 0);
    		}
    		//Main main = new Main();
    		System.out.println(Main.re(sign, datamap, remap, datastart));
    		n--;
        }
	}
}
