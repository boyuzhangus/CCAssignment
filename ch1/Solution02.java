public class Solution02 {
	public static boolean isPermutation(String str1, String str2) {
		if( str1.length()!= str2.length()) {
			return false;    //If the length of two string aren't same, It's unlikely that there is a permutation.
		}
		char []temp1 = str1.toCharArray(); //convert it into char array for sorting it
		char []temp2 = str2.toCharArray();
		java.util.Arrays.sort(temp1); //Prepare to compare each character by the method of sort
		java.util.Arrays.sort(temp2);
		for(int i = 0; i < str1.length(); i++) {
			if (temp1[i]!=temp2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String test1 = "abcsc";
		String test2 = "ccsab"; //should be true
		String test3 = "  ";
		String test4 = "    "; // should be false
		System.out.println(Solution02.isPermutation(test3,test4));
	}
}
