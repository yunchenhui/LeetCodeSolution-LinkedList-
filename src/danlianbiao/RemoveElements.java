package danlianbiao;
//题目：移除链表元素
//删除链表中等于给定值 val 的所有节点。
//
//示例:
//
//输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
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