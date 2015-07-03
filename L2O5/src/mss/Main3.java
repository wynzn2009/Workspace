package mss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num = new Integer[26];
		Boolean[][] appear = new Boolean[105][26];
		Boolean[] fib = {true,true,true,false,true,false,false,true,false,false,false
				,false,true,false,false,false,false,false,false,false,true,false,false,false,false,false};
		for(int i=0;i<num.length;i++){
			num[i] = 0;
		}
		for(int j=0;j<appear.length;j++){
			for(int k=0;k<appear[j].length;k++){
				appear[j][k] = false;
			}
		}
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String s = in.nextLine();
			if(s.length()==1){
				System.out.println(s);
				continue;
			}
			List<String> list = new ArrayList<String>();
			Map<String, Integer> map = new HashMap<String, Integer>();
			int n = s.length();
			for(int i=0;i<n;i++){
				num[i] = 1;
				appear[i][s.charAt(i)-'a'] = true;
				if(map.get(s.substring(i, i))==null){
					map.put(s.substring(i, i), 1);
					list.add(s.substring(i, i));
				}
				//map.put(s.substring(i, 1), 1);
			}
			for(int j=0;j<n;j++){
				for(int i=0;i<n-j;i++){
					if(appear[i][s.charAt(j+i)-'a']){
						num[i]++;
					}
					if(fib[num[i]-1]){
						//map.put(s.substring(t,j+1), 1);
						if(map.get(s.substring(i,j+1))==null){
							map.put(s.substring(i,j+1), 1);
							list.add(s.substring(i,j+1));
						}
					}
					appear[i][s.charAt(i+j)-'a'] = true;
				}
			}
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
        }
		
		
	}

}
