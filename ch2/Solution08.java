public class Solution08{
	static class LinkedListNode{ // define the LinkedList
		int data;
		LinkedListNode next;
		public LinkedListNode(){}
		public LinkedListNode(int a){
			data = a;
			next = null;
		}
	}
		public LinkedListNode intersec(LinkedListNode head){ 
		LinkedListNode runner1 = head;
		LinkedListNode runner2 = head;
		while(runner1 != null && runner1.next != null){ //find the position of first collision
			runner1 = runner1.next.next;
			runner2 = runner2.next;
			if(runner1 == runner2)
				break;
		}
		LinkedListNode inter = runner1;   
		runner2 = head;
		while(runner2 != runner1){ //find the second collision
			runner2 = runner2.next;
			runner1 = runner1.next;
		}
		return runner1;
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(1);//should be true
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(5);
		head.next.next.next.next.next = head.next.next;
		
		Solution08 solution = new Solution08();
		System.out.println(solution.intersec(head).data);
	}
}
