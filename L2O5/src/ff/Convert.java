package ff;

public class Convert {
	public static String convert(String s, int nRows) {
		if(s.length()==0||nRows==1){
			return s;
		}
        char[]t = s.toCharArray();
        StringBuffer d = new StringBuffer();
        //char[]p = new char[t.length];
        int k = 1;
        int j = 0;
        boolean flag = true;
        while(j<t.length){
        	if(k==1||k==nRows){
        		for(int i=k-1;i<t.length;){
        			d.append(t[i]);
        			j++;
        			i = i+2*nRows-2;
        		}
        	}else{
        		for(int i=k-1;i<t.length;){
        			d.append(t[i]);
        			j++;
        			if(flag){
        				i = i + (nRows-k)*2;
        				flag = false;
        			}else{
        				i = i +(k-1)*2;
        				flag = true;
        			}
        		}
        	}
        	k++;
        	flag = true;
        }
		return d.toString();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A";
		int nRows = 2;
		Convert.convert(s, nRows);
	}

}
