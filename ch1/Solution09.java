public class Solution09{
	public static boolean isSubstring(String str1, String str2) {
		return str2.contains(str1);
	}
	public static boolean isRotation(String s1, String s2){
		if(s1.length() != s2.length()) //Judge the given length
			return false;
		String str = s1+s1;  //concate two same s1 to construct a useful string
		return Solution09. isSubstring(s2, str);
	}
	public static void main(String []args) {
		System.out.println(Solution09.isRotation("waterbottle","erbottlewat")); //should be true
	}
}
