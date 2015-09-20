public class Solution02{
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
	public LinkedListNode ktolast(LinkedListNode head, int k){
		LinkedListNode runner = head; //using two pointer strategy
		for (int i=0;i<k;i++){
			if(runner == null)
				return null;
			runner = runner.next;
			
		}
		while(runner != null){
			runner = runner.next;
			head = head.next;
		}
		return head;
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(3);//should be 3
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(1);
		head.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next = null;
		Solution02 solution = new Solution02();
		LinkedListNode result = solution.ktolast(head,5);
		System.out.println(result.data);
	}	
}
