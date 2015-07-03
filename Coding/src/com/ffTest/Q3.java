package com.ffTest;

public class Q3 {
	class Point{
		public int x;
		public int y;
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	public int solution(Point[] point){
		if(point==null||point.length<3){
			return 0;
		}
		int sum = 0;
		for(int i=0;i<point.length-2;i++){
			for(int j=i+1;j<point.length-1;j++){
				for(int k=j+1;k<point.length;k++){
					if(onLine(i,j,k,point)){
						sum++;
					}
				}
			}
		}
		return sum>100000000?-1:sum;
	}
	private boolean onLine(int a,int b,int c,Point[] point){
		Point pa = point[a];
		Point pb = point[b];
		Point pc = point[c];
		int x1 = pa.x-pb.x;
		int y1 = pa.y-pb.y;
		int x2 = pa.x-pc.x;
		int y2 = pa.y-pc.y;
		if(x1*y2==x2*y1){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
