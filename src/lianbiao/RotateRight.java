package lianbiao;
//��ת����
//����һ��������ת����������ÿ���ڵ������ƶ� k ��λ�ã����� k �ǷǸ�����
//
//ʾ�� 1:
//
//����: 1->2->3->4->5->NULL, k = 2
//���: 4->5->1->2->3->NULL
//����:
//������ת 1 ��: 5->1->2->3->4->NULL
//������ת 2 ��: 4->5->1->2->3->NULL
//ʾ�� 2:
//
//����: 0->1->2->NULL, k = 4
//���: 2->0->1->NULL
//����:
//������ת 1 ��: 2->0->1->NULL
//������ת 2 ��: 1->2->0->NULL
//������ת 3 ��: 0->1->2->NULL
//������ת 4 ��: 2->0->1->NULL
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