package ff;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode p = head;
		while(p!=null){
        	list.add(p);
        	p = p.next;
        }
		int t = list.size() - n-1;
		if(t<0){
			return head.next;
		}else{
			p = list.get(t);
			p.next = p.next.next;
			return head;
		}
    }
	public static ListNode removeNthFromEnd1(ListNode head, int n) {
        Stack<ListNode> s = new Stack<ListNode>();
        ListNode p = head;
        int count = 0;
        while(p!=null){
        	s.push(p);
        	count++;
        	p = p.next;
        }
        ListNode a = null;
        ListNode b = null;
        for(int i=0;i<n;i++){
        	a = s.pop();
        }
        if(s.isEmpty()){
        	return head.next;
        }
        b = s.pop();
        b.next = a.next;
        return head;
    }
	public static ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head==null){
        	return null;
        }
        ListNode p = head;
        ListNode q = head;
        for(int i=0;i<n;i++){
        	q = q.next;
        }
        if(q==null){
        	return head.next;
        }
        while(q.next!=null){
        	p = p.next;
        	q = q.next;
        }
        p.next = p.next.next;
        return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		RemoveNthFromEnd.removeNthFromEnd2(head, 1);
	}

}
