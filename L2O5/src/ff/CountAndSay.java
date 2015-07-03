package ff;

public class CountAndSay {
	public String countAndSay(int n) {
		String a = "1";
		while(n>1){
			a = say(a);
			n--;
		}
		return a;
    }
	public String say(String a){
		char[]t = a.toCharArray();
		char n = t[0];
		int count = 0;
		String k = "";
		for(int i=0;i<t.length;i++){
			if(n==t[i]){
				count++;
			}else{
				k = k+String.valueOf(count)+String.valueOf(n);
				count = 1;
				n = t[i];
			}
		}
		k = k + String.valueOf(count)+String.valueOf(n);
		return k;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay a = new CountAndSay();
		a.countAndSay(4);
	}

}
