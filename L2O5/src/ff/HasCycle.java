package ff;

public class HasCycle {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public boolean hasCycle(ListNode head) {
        if(head==null){
        	return false;
        }else if(head.val==0){
        	return true;
        }else{
        	head.val = 0;
        	return  hasCycle(head.next);
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "页面处理意见：巴拉巴拉吧：，，，页面意见：五色风文风";
		String bb = aa.replaceAll("意见：", "");
		System.out.println(bb);

	}

}
