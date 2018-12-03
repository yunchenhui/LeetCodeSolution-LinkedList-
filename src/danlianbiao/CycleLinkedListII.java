package danlianbiao;
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
//具体数学几何分析见： 环形链表相遇问题（循环链表的快慢指针）.doc文件
//说明：不允许修改给定的链表。
//
//进阶：
//你是否可以不用额外空间解决此题？
public class CycleLinkedListII {

	public static void main(String[] args) {
		
	}

}
class CycleLinkedListIISolution{
	public ListNode hasCycleIISolution(ListNode head) {
		boolean cycle=false;
		ListNode fast;
		ListNode slow;
		ListNode start = null;
		fast=slow=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				cycle=true;
				fast=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
				start=slow;
				break;
			}
		}
		return cycle?start:null;
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