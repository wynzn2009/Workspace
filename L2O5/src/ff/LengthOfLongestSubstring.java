package ff;

import java.util.HashSet;

public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		if(s==null || s.length()==0)  
	        return 0;  
	    HashSet<Character> set = new HashSet<Character>();  
	    int max = 0;  
	    int walker = 0;  
	    int runner = 0;  
	    while(runner<s.length())  
	    {  
	        if(set.contains(s.charAt(runner)))  
	        {  
	            if(max<runner-walker)  
	            {  
	                max = runner-walker;  
	            }  
	            while(s.charAt(walker)!=s.charAt(runner))  
	            {  
	                set.remove(s.charAt(walker));  
	                walker++;  
	            }  
	            walker++;  
	        }  
	        else  
	        {  
	            set.add(s.charAt(runner));  
	        }  
	        runner++;  
	    }  
	    max = Math.max(max,runner-walker);  
	    return max;  
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdedfav";
		LengthOfLongestSubstring.lengthOfLongestSubstring(s);
	}

}
