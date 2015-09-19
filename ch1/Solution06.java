public class Solution06{
	public static String compress(String a) {
		if (a.length() <= 1) //special situation
			return a;
		StringBuffer newstr = new StringBuffer();
		char[] str = a.toCharArray();
		int countdupli = 1;
		newstr.append(str[0]); //the first letter
		for(int i = 1; i < a.length(); i++) {
			if (str[i] != str[i-1]) { 
				newstr.append(countdupli); //append the number of previous repeated
				newstr.append(str[i]);
				countdupli = 1;
			}
			else {
				countdupli++;
			}
	}
	newstr.append(countdupli);
	if (newstr.length() < a.length()) //compare length with original length
		return newstr.toString();
	else
		return a;
}
	public static void main(String []args) {
		String test = "aaaaafg"; //should be a5f1g1
		String test2 = "aabcccccaaa";
		String test3 = "a"; // should be 
		System.out.println(Solution06.compress(test2));
	}
}
