package lianbiao;
//�ϲ�������������
//��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 
//
//ʾ����
//
//���룺1->2->4, 1->3->4
//�����1->1->2->3->4->4
public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class MergeTwoListsSolution{
	public ListNode mergeTwoListsSolution(ListNode l1,ListNode l2) {
		ListNode copyhead=new ListNode(-1);
		ListNode cur=copyhead;
		while(l1!=null&&l2!=null) {
			if(l1.val<l2.val) {
				cur.next=l1;
				cur=cur.next;
				l1=l1.next;
			}
			else {
				cur.next=l2;
				cur=cur.next;
				l2=l2.next;
			}
		}
		if(l1==null) {
			cur.next=l2;
		}
		else
			cur.next=l1;
		return copyhead.next;
	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
}