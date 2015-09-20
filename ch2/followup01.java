public class followup01{
	static class LinkedListNode{
	int data;
	LinkedListNode next;
	public LinkedListNode(){
	}
	public LinkedListNode(int a){
		this.data = a;
		this.next = null;
	}
}
	public void removeDupli(LinkedListNode temp) {
		LinkedListNode head = temp;
		LinkedListNode runner = new LinkedListNode();
		LinkedListNode previous = new LinkedListNode();
		while (temp != null){
			runner = temp; 
			while (runner.next != null){
				if(runner.next.data == temp.data) {
					runner.next = runner.next.next;   //remove deplicate
				}
				else
				runner = runner.next;
			}
			temp = temp.next;
		}
		followup01.print(head);

	}
	public static void print(LinkedListNode head) { //output the result
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(1);//should be 1 3 2
		head.next = new LinkedListNode(3);
		head.next.next = new LinkedListNode(1);
		head.next.next.next = new LinkedListNode(2);
		head.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next = null;
		followup01 solution = new followup01();
		solution.removeDupli(head);
	}
}
