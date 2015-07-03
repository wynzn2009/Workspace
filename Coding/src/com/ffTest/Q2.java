package com.ffTest;

public class Q2 {
	public static int solution(int N){
		if(N==0){
			return 1;
		}
		if(N==1){
			return 2;
		}
		int a[] = new int[N+1];
		a[0] = 1;
		a[1] = 2;
		int two = 1;
		int three = 0;
		for(int i=2;i<N+1;i++){
			if(2*a[two]<3*a[three]){
				a[i] = 2*a[two];
				two++;
			}else if(2*a[two]>3*a[three]){
				a[i] = 3*a[three];
				three++;
			}else{
				a[i] = 3*a[three];
				two++;
				three++;
			}
		}
		return a[N];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Q2.solution(7));
	}

}
