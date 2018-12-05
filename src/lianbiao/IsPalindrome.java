package lianbiao;
//��������
//���ж�һ�������Ƿ�Ϊ��������
//
//ʾ�� 1:
//
//����: 1->2
//���: false
//ʾ�� 2:
//
//����: 1->2->2->1
//���: true
//���ף�
//���ܷ��� O(n) ʱ�临�ӶȺ� O(1) �ռ临�ӶȽ�����⣿
public class IsPalindrome {

	public static void main(String[] args) {

	}

}
class IsPalindromeSolution{
	public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode start=head;
		ListNode fast=head;
		ListNode slow=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		ListNode mid=slow.next;
		while(mid.next!=null) {
			ListNode temp=mid.next;
			mid.next=temp.next;
			temp.next=slow.next;
			slow.next=temp;
		}
		while(slow.next!=null) {
			slow=slow.next;
			if(start.val!=slow.val)
				return false;
			start=start.next;
		}
		return true;
	}
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
}