import java.util.*;
public class Solution01{
	static class LinkedListNode{ //define the Node
	int data;
	LinkedListNode next;
	public LinkedListNode(){
	}
	public LinkedListNode(int a){
		this.data = a;
		this.next = null;
	}
}
	public void removeDupli(LinkedListNode head) {
		if (head.next == null) {
			Solution01.print(head);
		}
		LinkedListNode temp = head;
		HashSet check = new HashSet(); //use the property of HashSet to dedupli
		check.add(head.data);
		while(temp.next != null) {
			if(!check.add(temp.next.data)) {
				temp.next = temp.next.next; //remove duplicate
			}
			else
			temp = temp.next;
		}
		Solution01.print(head);
	}
	public static void print(LinkedListNode head) { //output the result
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	public static void main(String []args){
		LinkedListNode head = new LinkedListNode(3);//should be 3 2
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(3);
		head.next.next.next.next = new LinkedListNode(2);
		head.next.next.next.next.next = null;
		Solution01 solution = new Solution01();
		solution.removeDupli(head);
	}
}
