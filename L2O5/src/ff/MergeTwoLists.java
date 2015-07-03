package ff;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null){
			return l2;
		}else if(l2==null){
			return l1;
		}
        ListNode a = null;
        if(l1.val<l2.val){
    		a = l1;
    		l1 = l1.next;
    	}else{
    		a = l2;
    		l2 = l2.next;
    	}
        ListNode b = null;
        b = a;
        while(l1!=null&&l2!=null){
        	if(l1.val<l2.val){
        		b.next = l1;
        		l1 = l1.next;
        	}else{
        		b.next = l2;
        		l2 = l2.next;
        	}
        	b = b.next;
        }
        if(l1!=null){
        	b.next = l1;
        }else{
        	b.next = l2;
        }
        return a;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoLists a = new MergeTwoLists();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		a.mergeTwoLists(l1, l2);
		
	}

}
