public class Solution09{
	public static boolean isRotation(String s1, String s2){
		if(s1.length() != s2.length()) //Judge the given length
			return false;
		String str = s1+s1;  //concate two same s1 to construct a useful string
		return isSubstring(s2, str);
	}
}
