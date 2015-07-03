package com.leetcode;

public class SortList {
	public int[] sortList(int[] head) {
        if(head==null||head.length<=1){
        	return head;
        }
		this.help(0, head.length-1, head);
		return head;
    }
	private void help(int l,int r,int[] head){
		if(l>=r){
			return;
		}
		int a = head[l];
		int s = l+1;
		int e = r;
		while(s<e){
			if(head[s]>a){
				head[s] = head[s]^head[e];
				head[e] = head[s]^head[e];
				head[s] = head[s]^head[e];
				e--;
			}else{
				s++;
			}
		}
		if(head[s]<a){
			head[s] = head[s]^head[l];
			head[l] = head[s]^head[l];
			head[s] = head[s]^head[l];
		}else if(l!=s-1){
			head[s-1] = head[s-1]^head[l];
			head[l] = head[s-1]^head[l];
			head[s-1] = head[s-1]^head[l];
			s = s-1;
		}else{
			s = l;
		}
		help(l,s-1,head);
		help(s+1,r,head);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortList a = new SortList();
		int[]b = {5,4,3,2,1,6,7,8,9,0};
		a.sortList(b);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		int 提;
		System.out.println(提 = 1);
	}

}
