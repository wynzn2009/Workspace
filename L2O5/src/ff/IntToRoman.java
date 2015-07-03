package ff;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
	public static String intToRoman(int num) {
        String a = "";
        char[] t = null;
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");
    	t = String.valueOf(num).toCharArray();
    	for(int i=0;i<t.length;i++){
    		int temp = (t[i]-48)*(int)Math.pow(10.0, t.length-i-1);
        	a = temp!=0?a + map.get(temp):a;
        }
        return a;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		IntToRoman.intToRoman(a);
	}

}
