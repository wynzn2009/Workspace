package ff;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		s = s.replaceAll("[\\s]+",",");
		String []q = s.split(",");
		if(q.length==0){
			return 0;
		}else{
			return q[q.length-1].toCharArray().length;
		}
    }
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLastWord1(String s) {
		s = s.replaceAll("[\\s]+",",");
		int a = s.lastIndexOf(",");
		if(a==-1){
			return s.toCharArray().length;
		}else if(a<s.length()-1){
			return s.length()-1-a;
		}else{
			s = s.substring(0, a);
			int b = s.lastIndexOf(",");
			if(b==-1){
				return a;
			}else{
				return a - b - 1;
			}
		}
    }
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static int lengthOfLastWord2(String s){
		int count = 0;
		char []y = s.toCharArray();
		for(int i=y.length-1;i>=0;i--){
			if(y[i]!=' '){
				count++;
			}else if(count>0){
				return count;
			}
		}
		return count;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " a ";
		LengthOfLastWord.lengthOfLastWord1(s);
	}

}
