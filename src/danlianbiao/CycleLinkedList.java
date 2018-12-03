package danlianbiao;
//给定一个链表，判断链表中是否有环。
//
//进阶：
//你能否不使用额外空间解决此题？
public class CycleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class HasCycleSolution{
	public boolean hasCycle(ListNode head) {
		ListNode slow;
		ListNode fast;
		slow=fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			val=x;
			next=null;
		}
	}
}