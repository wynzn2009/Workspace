package ff;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
        if("".equals(s)){
        	return true;
        }
        s = s.toLowerCase();
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length-1;
        while(i<j){
        	if(a[i]<48||a[i]>122||(a[i]>57&&a[i]<97)){
        		i++;
        		continue;
        	}
        	if(a[j]<48||a[j]>122||(a[j]>57&&a[j]<97)){
        		j--;
        		continue;
        	}
        	if(a[i]==a[j]){
        		i++;
        		j--;
        	}else{
        		return false;
        	}
        }
        return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
