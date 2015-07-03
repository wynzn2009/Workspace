package ff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInt {
	public static int romanToInt(String s) {
        String a1 = "IV";
        String a2 = "IX";
        String b1 = "XL";
        String b2 = "XC";
        String c1 = "CD";
        String c2 = "CM";
        List<Integer> index=new ArrayList<Integer>();
        char[] schar = s.toCharArray();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        //List<Integer> index = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0;i<schar.length;i++){
        	sum = sum + map.get(String.valueOf(schar[i]));
        }
        if(s.indexOf(a1)!=-1){
        	index.add(s.indexOf(a1));
        }
        if(s.indexOf(a2)!=-1){
        	index.add(s.indexOf(a2));
        }
        if(s.indexOf(b1)!=-1){
        	index.add(s.indexOf(b1));
        }
        if(s.indexOf(b2)!=-1){
        	index.add(s.indexOf(b2));
        }
        if(s.indexOf(c1)!=-1){
        	index.add(s.indexOf(c1));
        }
        if(s.indexOf(c2)!=-1){
        	index.add(s.indexOf(c2));
        }
        for(int j=0;j<index.size();j++){
        	sum = sum -2*map.get(String.valueOf(schar[index.get(j)]));
        }
		return sum;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInt.romanToInt("DCXXI");
	}

}
