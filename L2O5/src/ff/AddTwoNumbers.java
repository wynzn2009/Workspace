package ff;

public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        int dot = 0;
        if(l1==null){
        	return l2;
        }
        if(l2==null){
        	return l1;
        }
        while(a!=null){
        	int k = a.val+l2.val+dot;
        	int sum = k%10;
        	a.val = sum;
        	dot = k/10;
        	if(a.next==null){
        		if(l2.next!=null){
        			a.next = l2.next;
        			while(dot!=0&&a.next!=null){
        				a.next.val = a.next.val+dot;
        				if(a.next.val>=10){
        					dot = a.next.val/10;
        					a.next.val = a.next.val%10;
        					a = a.next;
        				}else{
        					dot = 0;
        				}
        			}
        		}
        		break;
        	}
        	if(l2.next==null){
        		if(a.next!=null){
        			while(dot!=0&&a.next!=null){
        				a.next.val = a.next.val+dot;
        				if(a.next.val>=10){
        					dot = a.next.val/10;
        					a.next.val = a.next.val%10;
        					a = a.next;
        				}else{
        					dot = 0;
        				}
        			}
        		}
        		break;
        	}
        	a = a.next;
        	l2 = l2.next;
        }
        if(dot!=0){
        	a.next = new ListNode(dot);
        }
		return l1;
    }
	
	public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode sum = result;
		int temp = 0;
		int l1data = 0;
		int l2data = 0;
		while(l1!=null||l2!=null){
			result.next = new ListNode(0);
			result = result.next;
			if(l1==null){
				l1data = 0;
			}else{
				l1data = l1.val;
				l1 = l1.next;
			}
			if(l2==null){
				l2data = 0;
			}else{
				l2data = l2.val;
				l2 = l2.next;
			}
			result.val = (l1data+l2data+temp)%10;
			temp = (l1data+l2data+temp)/10;
		}
		if(temp!=0){
			result.next = new ListNode(temp);
		}
		return sum.next;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 3;
	}

}
