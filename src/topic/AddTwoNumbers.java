package topic;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * 
 * 
 * @author yangtong
 *
 *accepted 2015.07.21
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		boolean hasCarry = false;
		ListNode l3;
		if((l1.val+l2.val)>=10){
			l3 = new ListNode(l1.val+l2.val-10);
			hasCarry = true;
		}else {
			l3 = new ListNode(l1.val+l2.val);			
		}
		ListNode tmp1 = l1;//L1 point
		ListNode tmp2 = l2;//L2 point
		ListNode tmp3 = l3;//L3 point
		ListNode tmp = null;
		int value = 0;		
		while (tmp1.next!=null||tmp2.next!=null) {
			if(tmp1.next!=null&&tmp2.next!=null){
				tmp1 = tmp1.next;
				tmp2 = tmp2.next;
				value = tmp1.val+tmp2.val;				
			}else if (tmp1.next!=null&&tmp2.next==null) {
				tmp1 = tmp1.next;
				value = tmp1.val+0;
			}else if (tmp2.next!=null&&tmp1.next==null) {
				tmp2 = tmp2.next;
				value = 0+tmp2.val;
			}
			value = hasCarry?value+1:value;
			if(value>=10){
				tmp = new ListNode(value-10);
				hasCarry = true;
			}else {
				tmp = new ListNode(value);
				hasCarry = false;
			}			
			tmp3.next = tmp;
			tmp3 = tmp;
		}
		if(hasCarry){
			tmp3.next = new ListNode(1);
		}
		return l3;
	}
	
	public class ListNode{
		public int val;
		public ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
}
