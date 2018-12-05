package lianbiao;
//回文链表
//请判断一个链表是否为回文链表。
//
//示例 1:
//
//输入: 1->2
//输出: false
//示例 2:
//
//输入: 1->2->2->1
//输出: true
//进阶：
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
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