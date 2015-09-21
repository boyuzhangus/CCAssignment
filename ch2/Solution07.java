public class Solution07{
	static class LinkedListNode{ // define LinkedListNode
		int data;
		LinkedListNode next;
		public LinkedListNode(){
		}
		public LinkedListNode(int a){
			data = a;
			next = null;
		}
	}
		public LinkedListNode isIntersect(LinkedListNode str1, LinkedListNode str2) { //check if it intersects

			LinkedListNode head1 = str1;
			LinkedListNode head2 = str2;
			LinkedListNode tail1 = new LinkedListNode();   
			LinkedListNode tail2 = new LinkedListNode();
			int length1 = 0;
			int length2 = 0;
			while(str1!=null){
				length1++;
				if(str1.next == null)
					tail1 = str1;
				str1 = str1.next;
			}
			while(str2!=null){
				length2++;
				if(str2.next == null)
					tail2 = str2;
				str2 = str2.next;
			}
			if (str1!=str2){
				return null;
			}
			if(length1 - length2>0){
				for(int i= 0; i<length1-length2; i++){
					head1 = head1.next;   //move advance in terms of the difference of length
				}
				while(head1 != head2){
					head1 = head1.next;
					head2 = head2.next;
				}
				return head1;
			}
			else{
				for(int i= 0; i<length2-length1; i++){
					head2 = head2.next;
				}
				while(head1 != head2){
					head1 = head1.next;
					head2 = head2.next;
				}
				return head1;
			}
		}
		public static void main(String []args){
		LinkedListNode head = new LinkedListNode(3);//should be 3
		head.next = new LinkedListNode(2);
		LinkedListNode inter = new LinkedListNode(3);
		head.next.next = inter;
		head.next.next.next = new LinkedListNode(2);
		LinkedListNode test = new LinkedListNode(6);
		test.next = inter;
		test.next.next = new LinkedListNode(8);
		test.next.next.next = new LinkedListNode(9);
		Solution07 solution = new Solution07();
		System.out.println(solution.isIntersect(head,test).data);
	
	}
}
