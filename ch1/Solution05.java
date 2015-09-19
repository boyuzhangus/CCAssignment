public class Solution05 {
	public static boolean isOneEdit(String a, String b) {
		int leng1 = a.length();
		int leng2 = b.length();
		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();
		if (!(leng1 - leng2 == -1 || leng1 - leng2 == 0 || leng1 - leng2 ==1)) {
			return false;
		}
		else {
			if (leng1 - leng2 == 0) { //when lengths are equal, the number of difference cannot exceed 2
				int numofdiff = 0;
				for (int i = 0; i < leng1; i++) {
					if (str1[i]!= str2[i]) {
						numofdiff++;
					}
					if(numofdiff > 1) {
						return false;
					}
				}
				return true;
			}
			else if(leng1 - leng2 == -1) { //when length of str1<str2, only 1 char can be skipped
				boolean flag = false;
				int index = 0;
				for (int i = 0; i < leng1; i++) {
					if (str1[i]!= str2[i]) {
						index = i;
						flag = true;
						break;
					}
				}
				if (!flag){
					return true;
				}
				else {
					for (int i = index; i < leng1; i++) {
						if (str1[i] != str2[index+1]) {
							return false;
						}
						index++;
					}
					return true;
				}
			}
			else if(leng1 - leng2 == 1) { // when length1>length2, we can only skip 1 char in str1
			boolean flag2 = false;
			int index2 = 0;
			for (int i = 0; i < leng2; i++) {
				if (str1[i]!= str2[i]) {
					index2 = i;
					flag2 = true;
					break;
				}
			}
			if (!flag2){
				return true;
			}
			else {
					for (int i = index2; i < leng2; i++) {
						if (str1[index2+1] != str2[i]) {
						return false;
					}
					index2++;
					}
				return true;
				}
			}
			}
		return false;
		}
	public static void main(String []args) {
		boolean test = Solution05.isOneEdit("pale","paale");// should be true
		System.out.println(test);
	} 
}
