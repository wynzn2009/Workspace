package ff;

public class DeleteDuplicates2 {
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
        	return head;
        }
        ListNode p = head;
        ListNode pp = head.next;
        ListNode ppp = null;
        boolean flag = false;
        while(pp!=null){
        	if(p.val==pp.val){
        		pp = pp.next;
        		flag = true;
        	}else{
        		if(flag){
        			if(ppp==null){
        				head = pp;
        				ppp = null;
        			}else{
        				ppp.next = pp;
        			}
        		}else{
        			ppp = p;
        		}
        		p = pp;
				pp = p.next;
				flag = false;
        	}
        }
        if(flag){
        	if(ppp==null){
        		head = null;
        	}else{
        		ppp.next = null;
        	}
        }
		return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
