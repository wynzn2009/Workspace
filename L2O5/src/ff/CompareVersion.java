package ff;

public class CompareVersion {
	public static int compareVersion(String version1, String version2) {
        String []t1 = version1.split("\\.");
        String []t2 = version2.split("\\.");
        for(int i=0;i<(t1.length>t2.length?t1.length:t2.length);i++){
        	if(i>t1.length-1){
        		if(Integer.valueOf(t2[i])==0){
        			return 0;
        		}else{
        			return -1;
        		}
        	}
        	if(i>t2.length-1){
        		if(Integer.valueOf(t1[i])==0){
        			return 0;
        		}else{
        			return 1;
        		}
        	}
        	if(Integer.valueOf(t1[i]).equals(Integer.valueOf(t2[i]))){
        		continue;
        	}else if(Integer.valueOf(t1[i])>Integer.valueOf(t2[i])){
        		return 1;
        	}else{
        		return -1;
        	}
        }
		return 0;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareVersion.compareVersion("01", "1");
	}

}
