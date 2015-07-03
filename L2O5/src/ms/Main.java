package ms;
import java.util.Scanner;
public class Main {
	public static int right(int x,int y,int z,String str){
		int cr = 0;
		int cy = 0;
		int cb = 0;
		int MaxCount = 0;
		int count = 0;
		int k = Math.max(Math.max(x, y),z);
		int l = Math.min(Math.min(x, y),z);
		k = l+k;
		l = 2*k-3*l;
		char a[] = str.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]=='R'){
				cr++;
			}else if(a[i]=='Y'){
				cy++;
			}else{
				cb++;
			}
			int sum = cr + cy + cb;
			int max = Math.max(Math.max(cr, cy),cb);
			int min = Math.min(Math.min(cr, cy),cb);
			if(sum==(3*min+k)||sum==(3*min+l)){
				MaxCount = Math.max(MaxCount, count);
				count = 0;
			}else{
				count++;
			}
			
		}
		return MaxCount;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "RRYBRBRYBRY";
		Main.right(1, 2, 3, str1);
		Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
        	int x = in.nextInt();
        	int y = in.nextInt();
        	int z = in.nextInt();
        	String str = in.next();
        	System.out.println(Main.right(x, y, z, str));
        }
	}
}
