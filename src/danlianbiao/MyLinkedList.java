package danlianbiao;
//�������
//��������ʵ�֡�������ѡ��ʹ�õ������˫�����������еĽڵ�Ӧ�þ����������ԣ�val �� next��val �ǵ�ǰ�ڵ��ֵ��next ��ָ����һ���ڵ��ָ��/���á����Ҫʹ��˫����������Ҫһ������ prev ��ָʾ�����е���һ���ڵ㡣���������е����нڵ㶼�� 0-index �ġ�
//
//����������ʵ����Щ���ܣ�
//
//get(index)����ȡ�����е� index ���ڵ��ֵ�����������Ч���򷵻�-1��
//addAtHead(val)��������ĵ�һ��Ԫ��֮ǰ���һ��ֵΪ val �Ľڵ㡣������½ڵ㽫��Ϊ����ĵ�һ���ڵ㡣
//addAtTail(val)����ֵΪ val �Ľڵ�׷�ӵ���������һ��Ԫ�ء�
//addAtIndex(index,val)���������еĵ� index ���ڵ�֮ǰ���ֵΪ val  �Ľڵ㡣��� index ��������ĳ��ȣ���ýڵ㽫���ӵ������ĩβ����� index ���������ȣ��򲻻����ڵ㡣
//deleteAtIndex(index)��������� index ��Ч����ɾ�������еĵ� index ���ڵ㡣
//
//
//ʾ����
//
//MyLinkedList linkedList = new MyLinkedList();
//linkedList.addAtHead(1);
//linkedList.addAtTail(3);
//linkedList.addAtIndex(1,2);   //�����Ϊ1-> 2-> 3
//linkedList.get(1);            //����2
//linkedList.deleteAtIndex(1);  //����������1-> 3
//linkedList.get(1);            //����3
//
//
//��ʾ��
//
//����ֵ���� [1, 1000] ֮�ڡ�
//������������  [1, 1000] ֮�ڡ�
//�벻Ҫʹ�����õ� LinkedList �⡣
public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MyLinkedListSolution{
	int size=0;
	ListNode head;
	ListNode tail;
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
	public MyLinkedListSolution() {
		
	}
	public int get(int index) {
		if(index>size-1)
			return -1;
		int count=0;
		ListNode temp=head;
		while(count!=index) {
			temp=temp.next;
			count++;
		}
		return temp.val;
	}
	public ListNode getPreNode(int index) {
		int count=0;
		ListNode temp=head;
		while(count!=index-1) {
			temp=temp.next;
			count++;
		}
		return temp;
	}
	public void addAtHead(int val) {
		if(head==null) {
			head=new ListNode(val);
			++size;
			tail=head;
		}
		else {
			ListNode temp=new ListNode(val);
			temp.next=head;
			head=temp;
			size++;
		}
	}
	public void addAtTail(int val) {
		if(head==null) {
			head=new ListNode(val);
			++size;
			tail=head;
		}
		else {
			ListNode temp=new ListNode(val);
			tail.next=temp;
			tail=tail.next;
			size++;
		}
	}
	public void addAtIndex(int index,int val) {
		if(index==0)
			addAtHead(val);
		else if(index==size)
			addAtTail(val);
		else if(index>0&&index<size) {
			ListNode temp=getPreNode(index);
			ListNode tempNext=temp.next;
			ListNode newNode=new ListNode(val);
			newNode.next=tempNext;
			temp.next=newNode;
			size++;
		}
	}
	public void deleteAtIndex(int index) {
		ListNode temp=getPreNode(index);
		if(index==0) {
			head=head.next;
			size--;
		}
		else if(index==size-1) {
			temp.next=null;
			tail=temp;
			size--;
		}
		else if(index>0&&index<size-1) {
//			ListNode tempnn=temp.next.next;
//			temp.next=tempnn;
//			size--;
			temp.next=temp.next.next;
		}
	}
}