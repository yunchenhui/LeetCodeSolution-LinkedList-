package lianbiao;
//�������
//�������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�
//
//��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
//
//�����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
//
//ʾ����
//
//���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
//�����7 -> 0 -> 8
//ԭ��342 + 465 = 807
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class AddTwoNumbersSolution{
	public ListNode addTwoNumbersSolution(ListNode l1,ListNode l2) {
		ListNode temp=null;
		ListNode result=null;
		int count=0;
		while(l1!=null||l2!=null||count!=0) {
			int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+count;
			count=sum/10;
			ListNode node=new ListNode(sum%10);
			if(temp==null) {
				temp=node;
				result=temp;//result=node;
			}
			else {
				temp.next=node;
				temp=temp.next;
			}
			l1=l1==null?null:l1.next;
			l2=l2==null?null:l2.next;
		}
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