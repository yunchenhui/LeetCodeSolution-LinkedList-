//��Ŀ  ��ת����
//��תһ�����������Ե�����ݹ�ط�ת����
//ʾ��������: 1->2->3->4->5->NULL�����: 5->4->3->2->1->NULL��
//����
//�����ķ������Դ�ͷ��ʼ������ÿ�ν�һ��ָ��ת,������Ҫ����ָ�뼴�ɽ����
//�ݹ�ķ�������Ҫ˼���ǵ��÷�ת������ת���������������ͷ���ϲ�����󷵻ط�ת�������ͷ���
//��תһ��������
//
//ʾ��:
//
//����: 1->2->3->4->5->NULL
//���: 5->4->3->2->1->NULL
//����:
//����Ե�����ݹ�ط�ת�������ܷ������ַ����������⣿
package lianbiao;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*******************����Ϊ�����������********************/
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
/*****************����Ϊ�ݹ鷽�����**********************/
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
