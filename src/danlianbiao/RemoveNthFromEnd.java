package danlianbiao;
//ɾ������ĵ�����N���ڵ�
//����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣
//
//ʾ����
//
//����һ������: 1->2->3->4->5, �� n = 2.
//
//��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5.
//˵����
//
//������ n ��֤����Ч�ġ�
//
//���ף�
//
//���ܳ���ʹ��һ��ɨ��ʵ����
public class RemoveNthFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class RemoveNthFromEndSolution{
	public ListNode removeNthFromEnd(ListNode head,int n) {
		ListNode preNode=head;
		ListNode curNode=head;
		for(int i=0;i<n;i++)
			curNode=curNode.next;
		if(curNode==null)
			return preNode.next;
		while(curNode.next!=null) {
			preNode=preNode.next;
			curNode=curNode.next;
		}
		preNode.next=preNode.next.next;
		return head;
	}
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x){
			val=x;
			next=null;
		}
	}
}