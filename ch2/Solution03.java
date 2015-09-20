public class Solution03{
	static class LinkedListNode{
		int data;
		LinkedListNode next;
		public LinkedListNode(){
		}
		public LinkedListNode(int a){
			data = a;
			next = null;
		}
	}
	public void deletenode(LinkedListNode del){
		if(del.next == null){
			del = null;
		}
		del.data = del.next.data;
		del.next = del.next.next;
	}
	public static void print(LinkedListNode head) { //output the result
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(1);//should be 3 2
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		LinkedListNode delete = head.next.next;
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(5);
		head.next.next.next.next.next = null;
		Solution03 solution = new Solution03();
		solution.deletenode(delete);
		Solution03.print(head);
	}
}
