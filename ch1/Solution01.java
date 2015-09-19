//Assumption : we are using ASCII extended char set
public class Solution01{
	public static boolean isUniqueChar(String str) {
		if (str.length() > 256) { 
			return false; // If length exceeds the length of char set, it must be some duplicate characters		
		}
		boolean []state = new boolean[256];//Store status of char set
		for(int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			if (state[index])     //If there has been a true, it means str had a same character before this index
				return false;
			else
				state[index] = true;
		}
		return true;
	}
	public static void main(String []args) {
		String test = "  ";// two space should be false
		String test2 = "abcac";// should be false
		String test3 = "abcdef";// should be true
		System.out.println(Solution01.isUniqueChar(test3));
	}
}
