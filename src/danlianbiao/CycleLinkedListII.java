package danlianbiao;
//����һ��������������ʼ�뻷�ĵ�һ���ڵ㡣 ��������޻����򷵻� null��
//������ѧ���η������� ���������������⣨ѭ������Ŀ���ָ�룩.doc�ļ�
//˵�����������޸ĸ���������
//
//���ף�
//���Ƿ���Բ��ö���ռ������⣿
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