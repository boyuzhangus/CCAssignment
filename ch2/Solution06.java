import java.util.*;
public class Solution06{
	static class LinkedListNode{//define the LinkedListNode
		int data;
		LinkedListNode next;
		int length=0;
		public LinkedListNode(){
		}
		public LinkedListNode(int a){
			data = a;
			next = null;
		}
	}
		public boolean isPalin(LinkedListNode head) { // use property of Stack: Last in First out
			LinkedListNode original = head;
			Stack<Integer> temp = new Stack<Integer>();
			while(head != null){
				temp.push(head.data);
				head = head.next;
			}
			while(original!=null){
				if(temp.pop() != original.data){
					return false;
				}
				original = original.next;
			}
			return true;
		}
		public static void main(String []args){
		LinkedListNode head = new LinkedListNode(3);//should be true
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(2);
		head.next.next.next.next = new LinkedListNode(3);
		head.next.next.next.next.next = null;
		Solution06 solution = new Solution06();
		System.out.println(solution.isPalin(head));
	}
	
}
