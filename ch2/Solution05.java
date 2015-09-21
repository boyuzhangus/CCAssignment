//For follow up, we can reverse two LinkedLists at first and calculate the plus as below
public class Solution05{
	static class LinkedListNode{ //define the LinkedListNode
	int data;
	LinkedListNode next;
	public LinkedListNode(){
	}
	public LinkedListNode(int a){
		this.data = a;
		this.next = null;
	}
}
	public LinkedListNode plus(LinkedListNode a, LinkedListNode b){ //implementation of operation of plus
		LinkedListNode sum = new LinkedListNode();
		LinkedListNode result = sum;
		int comp = 0;
		while (a != null || b != null){
			int temp = comp;
			if(a != null){               //judge if digit is null
				temp = temp + a.data;
				a = a.next;
			}
			if(b != null){
			    temp = temp + b.data;
			    b = b.next;
			}
			sum.data = temp % 10;
			comp = temp / 10;
			sum.next = new LinkedListNode();
			sum = sum.next;
		}
		return result;
	}
	public static void print(LinkedListNode head) { //output the result
		while(head.next != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(3);//should be 6477
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(7);
		
		LinkedListNode b = new LinkedListNode(3);
		b.next = new LinkedListNode(2);
		b.next.next = new LinkedListNode(4);
	
		Solution05 solution = new Solution05();
		Solution05.print(solution.plus(head, b));
	}

}
