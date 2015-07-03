package mss;
import java.util.Scanner;

public class Main{
	
	public static int findMax(int x,int y,int z,String str){
		int index=0;
		int cr=0,cy=0,cb=0;
		int max=0;
		int last=0;
		while(index<str.length()){
			char a=str.charAt(index);
			if(a=='R'){
				cr++;
			}
			else if(a=='Y'){
				cy++;
			}
			else{
				cb++;
			}
			if(		Math.abs(cr-cy)==z&&Math.abs(cy-cb)==x&&Math.abs(cb-cr)==y||
					Math.abs(cr-cy)==x&&Math.abs(cy-cb)==z&&Math.abs(cb-cr)==y||
					Math.abs(cr-cy)==y&&Math.abs(cy-cb)==x&&Math.abs(cb-cr)==z||
					Math.abs(cr-cy)==z&&Math.abs(cy-cb)==y&&Math.abs(cb-cr)==x||
					Math.abs(cr-cy)==y&&Math.abs(cy-cb)==z&&Math.abs(cb-cr)==x||
					Math.abs(cr-cy)==x&&Math.abs(cy-cb)==y&&Math.abs(cb-cr)==z){
				max=Math.max(max,index-last+1);
				last=index+1;
				cr=0;
				cy=0;
				cb=0;
			}
			index++;
		}
		max=Math.max(index-last, max);
		return max;
	}
	public static void main(String []args){	
		String a = "Programming";  
        String b = new String("Programming");  
        String c = "Program" + "ming";  
          
        System.out.println(a == b);  
        System.out.println(a == c);  
        System.out.println(a.equals(b));  
        System.out.println(a.equals(c));  
        System.out.println(a.intern() == b.intern());
	}
}


