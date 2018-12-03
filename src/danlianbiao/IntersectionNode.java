package danlianbiao;
//相交链表            具体分析见  相交链表.doc文件
//编写一个程序，找到两个单链表相交的起始节点。
//
//
//
//例如，下面的两个链表：
//
//A:          a1 → a2
//                 ↘
//                   c1 → c2 → c3
//                 ↗            
//B:     b1 → b2 → b3
//在节点 c1 开始相交。
//
//
//
//注意：
//
//如果两个链表没有交点，返回 null.
//在返回结果后，两个链表仍须保持原有的结构。
//可假定整个链表结构中没有循环。
//程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
public class IntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*****************************常规解决方案如下*****************************/
class IntersectionNodeSolution{
	public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
		int countA=countNumber(headA);
		int countB=countNumber(headB);
		if(countA>countB) {
			for(int i=0;i<countA-countB;i++) {
				headA=headA.next;
			}
		}
		else {
			for(int i=0;i<countB-countA;i++) {
				headB=headB.next;
			}
		}
		while(headA!=null&&headB!=null) {
			if(headA==headB)
				return headA;
			else {
				headA=headA.next;
				headB=headB.next;
			}
		}
		return null;
	}
	private int countNumber(ListNode head) {
		int count=0;
		while(head!=null) {
			++count;
			head=head.next;
		}
		return count;
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
/***********************根据总长度一致的最妙解决方案如下**********************************/
//class IntersectionNodeSolution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) {
//            return null;
//        }
//        ListNode curA = headA, curB = headB;
//        while (curA != curB) {
//            curA = (curA == null) ? headB : curA.next;
//            curB = (curB == null) ? headA : curB.next;
//        }
//        return curA;
//    }
//}