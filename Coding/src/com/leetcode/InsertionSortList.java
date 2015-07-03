package com.leetcode;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
        	return head;
        }
        ListNode help = new ListNode(head.val);
        ListNode temp = head;
        head = head.next;
        while(head!=null){
        	temp = help;
        	while(temp!=null){
        		if(head.val<=temp.val){
        			ListNode a = new ListNode(temp.val);
        			a.next = temp.next;
        			temp.next = a;
        			temp.val = head.val;
        			break;
        		}else if(temp.next==null){
        			temp.next = new ListNode(head.val);
        			break;
        		}else{
        			temp = temp.next;
        		}
        	}
        	head = head.next;
        }
        return help;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
