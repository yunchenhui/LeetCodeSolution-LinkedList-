package danlianbiao;
//����һ�������ж��������Ƿ��л���
//
//���ף�
//���ܷ�ʹ�ö���ռ������⣿
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