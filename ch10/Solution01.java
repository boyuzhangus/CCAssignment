// Assume that we need a ascending order
import java.util.*;
public class Solution01{
	public static int[] mergeAB(int[] a, int[] b, int alength){ // we need a parameter to denote the actual length of a
		int resultindex = alength + b.length-1;
		int indexofa = alength - 1;
		int indexofb = b.length - 1;
		while(indexofa >= 0 && indexofb >=0){ // using the last part of a as buffer
			if (a[indexofa]>=b[indexofb]){
				a[resultindex] = a[indexofa];
				indexofa--;
			}
			else {
				a[resultindex] = b[indexofb];
				indexofb--;
			}
			resultindex--;
		}
		if(indexofb>=0){           // move the elements left in b into a
			for (int i = resultindex; i>=0; i--) {
				
				a[i] = b[i];
			}
		}
		return a;
	}
	public static void main(String []args) {

		int[] str1 = new int[10]; //test case success
		str1[0]=3; 
		str1[1]=12;
		str1[2]=77; 
		str1[3]=567;
		int[] str2 = {4, 5, 9, 11, 345, 1101};
		String result = Arrays.toString(Solution01.mergeAB(str1, str2, 4));
		System.out.println(result);
	}
}
