package com.leetcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.omg.PortableInterceptor.Interceptor;

public class MergekSortedLists {
	public static ListNode mergeKLists(ListNode[] lists) {
		if(lists==null||lists.length==0){
			return null;
		}
		PriorityQueue<ListNode> p = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		for(int i=0;i<lists.length;i++){
			ListNode node = lists[i];
			if(node!=null){
				p.offer(node);
			}
		}
		ListNode head = null;
		ListNode trace = head;
		if(!p.isEmpty()){
			head = p.poll();
			if(head.next!=null){
				p.offer(head.next);
			}
			trace = head;
		}
		while(!p.isEmpty()){
			ListNode a = p.poll();
			trace.next = a;
			trace = trace.next;
			if(a.next!=null){
				p.offer(a.next);
			}
		}
		return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(2);
		ListNode b = new ListNode(1);
		b.next = new ListNode(1);
		b.next.next = new ListNode(2);
		ListNode[] lists = {a,b};
		MergekSortedLists.mergeKLists(lists);
		
	}
}
