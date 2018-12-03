package danlianbiao;
//�ཻ����            ���������  �ཻ����.doc�ļ�
//��дһ�������ҵ������������ཻ����ʼ�ڵ㡣
//
//
//
//���磬�������������
//
//A:          a1 �� a2
//                 �K
//                   c1 �� c2 �� c3
//                 �J            
//B:     b1 �� b2 �� b3
//�ڽڵ� c1 ��ʼ�ཻ��
//
//
//
//ע�⣺
//
//�����������û�н��㣬���� null.
//�ڷ��ؽ���������������뱣��ԭ�еĽṹ��
//�ɼٶ���������ṹ��û��ѭ����
//���������� O(n) ʱ�临�Ӷȣ��ҽ��� O(1) �ڴ档
public class IntersectionNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*****************************��������������*****************************/
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
/***********************�����ܳ���һ�µ���������������**********************************/
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