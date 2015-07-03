package ff;

public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        a = head;
        b = head.next;
        head = head.next;
        while(a.next!=null){
        	if(c!=null&&a!=null){
        		c.next = a.next;
        	}
        	c = b.next;
        	b.next = a;
        	a.next = c;
        	if(c!=null){
        		b = a;
        		a = c;
        		c = b;
        		b = a.next;
        	}
        }
		return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		SwapPairs a = new SwapPairs();
		a.swapPairs(head);
	}

}
