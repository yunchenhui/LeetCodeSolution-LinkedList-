package danlianbiao;
//��Ŀ���Ƴ�����Ԫ��
//ɾ�������е��ڸ���ֵ val �����нڵ㡣
//
//ʾ��:
//
//����: 1->2->6->3->4->5->6, val = 6
//���: 1->2->3->4->5
public class RemoveElements {

	public static void main(String[] args) {

	}

}
class RemoveElementsSolution{
	public ListNode removeElementsSolution(ListNode head,int val) {
		ListNode cur=new ListNode(-1);
		ListNode mark=cur;
		cur.next=head;
		while(head!=null) {
			if(head.val==val) {
				cur.next=head.next;
			}
			else {
				cur=cur.next;
			}
			head=head.next;
		}
		return mark.next;
	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
}