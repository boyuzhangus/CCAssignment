public class Solution04{
	static class LinkedListNode{ //Define LinkedList
		int data;
		LinkedListNode next;
		public LinkedListNode(){
		}
		public LinkedListNode(int a){
			data = a;
			next = null;
		}
	}
	public static void deletenode(LinkedListNode del){ //make use of the 3rd solution
		if(del.next == null){
			del = null;
		}
		del.data = del.next.data;
		del.next = del.next.next;
	}
	public LinkedListNode partition(LinkedListNode head, int x){//construct a new LinkedList
		LinkedListNode second = new LinkedListNode();
		LinkedListNode part1 = head;
		LinkedListNode part2 = second;
		while(head!=null){
			if(head.data >= x){
				second.data = head.data;
				second.next = new LinkedListNode();
				second = second.next;
				Solution04.deletenode(head);
				continue;
			}
			if(head.next == null){
				second = null;
				head.next = part2;
				break;
			}
			head = head.next;
		}
		return part1;
	}
	public static void print(LinkedListNode head) { //output the result
		while(head.next != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(3);//should be 3 2
		head.next = new LinkedListNode(5);
		head.next.next = new LinkedListNode(8);
		head.next.next.next = new LinkedListNode(5);
		head.next.next.next.next = new LinkedListNode(10);
		head.next.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next.next = new LinkedListNode(1);
		Solution04 solution = new Solution04();
		Solution04.print(solution.partition(head,5));
	}
}
