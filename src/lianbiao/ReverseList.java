//题目  反转链表
//反转一个单链表。可以迭代或递归地反转链表。
//示例：输入: 1->2->3->4->5->NULL；输出: 5->4->3->2->1->NULL。
//分析
//迭代的方法可以从头开始遍历，每次将一个指向反转,最少需要两个指针即可解决。
//递归的方法：主要思想是调用反转函数反转子链表。将子链表和头结点合并。最后返回反转的链表的头结点
//反转一个单链表。
//
//示例:
//
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
//进阶:
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
package lianbiao;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*******************以下为迭代方法解决********************/
//class ReverseListSolution{
//	public ListNode reverseListSolution(ListNode head) {
//		 ListNode pre = null;
//	     ListNode cur = head;
//	        while (cur != null){
//	            ListNode next = cur.next;
//	            cur.next = pre; 
//	            pre = cur;
//	            cur = next;
//	        }
//	        
//	     return pre;
//	}
//	class ListNode{
//		int val;
//		ListNode next;
//		ListNode(int x){
//			val=x;
//		}
//	}
//} 
/*****************以下为递归方法解决**********************/
class ReverseListSolution{
	public ListNode reverseListSolution(ListNode head) {
		if(head==null||head.next==null)
			return head;
		else {
			ListNode tail=reverseListSolution(head.next);
			head.next.next=head;
			head.next=null;
			return tail;
			
		}
	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
}
