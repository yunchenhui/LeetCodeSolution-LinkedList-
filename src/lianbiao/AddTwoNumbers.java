package lianbiao;
//两数相加
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//示例：
//
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
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