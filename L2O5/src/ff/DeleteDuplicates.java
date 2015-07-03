package ff;

public class DeleteDuplicates {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
        	return head;
        }
        ListNode a = new ListNode(0);
        a.next = head;
		while(head.next!=null){
			if(head.val==head.next.val){
				head.next = head.next.next;
			}else{
				head = head.next;
			}
		}
		return a.next;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
