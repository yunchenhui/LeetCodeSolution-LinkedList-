package lianbiao;
//旋转链表
//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
//
//示例 1:
//
//输入: 1->2->3->4->5->NULL, k = 2
//输出: 4->5->1->2->3->NULL
//解释:
//向右旋转 1 步: 5->1->2->3->4->NULL
//向右旋转 2 步: 4->5->1->2->3->NULL
//示例 2:
//
//输入: 0->1->2->NULL, k = 4
//输出: 2->0->1->NULL
//解释:
//向右旋转 1 步: 2->0->1->NULL
//向右旋转 2 步: 1->2->0->NULL
//向右旋转 3 步: 0->1->2->NULL
//向右旋转 4 步: 2->0->1->NULL
public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class RotateRightSolution{
	public ListNode rotateRightSolution(ListNode head,int k) {
		ListNode mark=null;
		int count=0;
		ListNode fast=head;
		ListNode slow=head;
		ListNode result=null;
		if(head==null||head.next==null)
			return head;
		mark=head;
		while(mark!=null) {
			mark=mark.next;
			count++;
		}
		int step=k%count;
		for(int i=0;i<step;i++) {
			fast=fast.next;
		}
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		fast.next=head;
		result=slow.next;
		slow.next=null;
		return result;
	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
}