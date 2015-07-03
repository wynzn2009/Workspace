package ff;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
	public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
		if(digits==null||digits.length()==0){
			return list;
		}
		list.add("");
		for(int i=0;i<digits.length();i++){
			String le = getLetters(digits.charAt(i));
			List<String> res = new ArrayList<String>();
			for(int j=0;j<list.size();j++){
				for(int k=0;k<le.length();k++){
					res.add(list.get(j)+Character.toString(le.charAt(k)));
				}
			}
			list = res;
		}
		return list;
    }
	
	private static String getLetters(char d){
		switch (d) {
		case '2':
			return "abc";
		case '3':
			return "def";
		case '4':
			return "ghi";
		case '5':
			return "jkl";
		case '6':
			return "mno";
		case '7':
			return "pqrs";
		case '8':
			return "tuv";
		case '9':
			return "wxyz";
		case '0':
			return "";
		default:
			return "";
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombinations.letterCombinations("2");
	}

}
