package ff;

public class TitleToNumber {
	public static int titleToNumber(String s) {
        int a = 0;
        int start = 'A'-1;
        char[] aa = s.toCharArray();
        for(int i=0;i<aa.length;i++){
        	int t = aa[aa.length-1-i]-start;
        	a = (int) (a + t*Math.pow(26, i));
        }
		return a;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = TitleToNumber.titleToNumber("AB");
		System.out.println(t);
	}

}
